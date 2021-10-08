import static java.util.stream.Collectors.toSet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class TableBuilder {

    private List<List<String>> data;
    private Table table;

    // Used to build the graph
    private Set<Index> remaining;
    private Set<Index> explored;

    public TableBuilder(List<List<String>> data, boolean hasHeaders) {
        int rows = data.size();
        int cols =  data.get(0).size();
        this.data = new ArrayList(data);

        if (!hasHeaders) {
            table = new Table(rows, cols);
        } else {
            rows -= 1;
            table = new Table(rows, cols);
            table.setHeaders(this.data.remove(0));

        }
        remaining = new HashSet(Index.generate(rows, cols));
        explored = new HashSet();
    }

    // Performs some preeliminary static validation
    public TableBuilder validate() {
        int cols = table.hasHeaders() ? table.getHeaders().size() : data.get(0).size();
        for (List<String> row : data) {
            if (row.size() != cols) {
                throw new RuntimeException("NUM COLS ERROR");
            }
        }

        return this;
    }

    public Table build() {
        while(!remaining.isEmpty()) {
            populate(remaining.iterator().next());
        }
        return table;
    }

    /* Populate the given index and any dependencies */
    private Cell populate(Index index) {
        if (!remaining.contains(index)) {
            return table.get(index);
        } 
        if (explored.contains(index)) {
            throw new RuntimeException("DAG ERROR");
        }

        explored.add(index);
        String value = data.get(index.row).get(index.col);
        Cell cell;

        Matcher intMatch = Patterns.matchInt(value);
        Matcher floatMatch = Patterns.matchFloat(value);
        Matcher stringActionMatch = Patterns.matchStringAction(value);
        Matcher numericActionMatch = Patterns.matchNumericAction(value);

        if (intMatch.matches()) {
            cell = new NumericCell(new Integer(value));

        } else if (floatMatch.matches()) {
            cell = new NumericCell(new Float(value));

        } else if (stringActionMatch.matches()) {
            Index reference = new Index(stringActionMatch.group(2));
            Cell child = populate(reference);
            StringActionCell c = new StringActionCell(stringActionMatch.group(1), value);
            c.addChild(child);
            cell = c;

        } else if (numericActionMatch.matches()) {
            List<Index> references = Index.generate(numericActionMatch.group(2));
            Set<Cell> children = references.stream().map(reference -> populate(reference)).collect(toSet());
            NumericActionCell c = new NumericActionCell(numericActionMatch.group(1), value);
            children.forEach(c::addChild);
            cell = c;

        } else {
            cell = new StringCell(value);
        }

        table.set(index, cell);
        remaining.remove(index);
        return table.get(index);

    }
}

final class Patterns {

    static Pattern INT = Pattern.compile("^[-+]?[0-9]+$");
    static Pattern FLOAT = Pattern.compile("^[-+]?[0-9]*\\.[0-9]*$");
    static Pattern NUMERIC_ACTION = Pattern.compile("^(__sum__|__avg__)\\((\\[[0-9]+,[0-9]+\\](?:,\\[[0-9]+,[0-9]+\\])*)\\)$");
    static Pattern STRING_ACTION = Pattern.compile("^(__to_upper__|__to_lower__)\\((\\[\\d+,\\d+\\])\\)$");

    static Matcher matchInt(String value) {
        return INT.matcher(value);
    }

    static Matcher matchFloat(String value) {
        return FLOAT.matcher(value);
    }

    static Matcher matchNumericAction(String value) {
        return NUMERIC_ACTION.matcher(value);
    }

    static Matcher matchStringAction(String value) {
        return STRING_ACTION.matcher(value);
    }

    private Patterns() {};
}