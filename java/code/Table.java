import static java.util.stream.Collectors.toList;

import java.util.Set;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Table {

    private static Pattern INT_PAT = Pattern.compile("^[-+]?\\d+$");
    private static Pattern FLOAT_PAT = Pattern.compile("^[-+]?[0-9]*\\.?[0-9]+$");
    // private static Pattern numericActionPat = Pattern.compile("^(__sum__|__avg__)\(\[(\d+),(\d+)\](?:,\[(\d+),(\d+)\])*\)$");
    private static Pattern STRING_ACTION_PAT = Pattern.compile("^(__to_upper__|__to_lower__)\\((\\[\\d+,\\d+\\])\\)$");

    private List<String> headers;
    private List<List<Cell>> matrix;
    private int rows;
    private int cols;

    public Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.headers = new ArrayList(cols);
        this.matrix = new ArrayList(rows);
        for (int r = 0; r < rows; r ++) {
            matrix.add(new ArrayList(cols));
            for (int c = 0; c < cols; c++) {
                matrix.get(r).add(null);
            }
        }
    }

    public Cell get(Index i) {
        return matrix.get(i.row).get(i.col);
    }

    public void set(Index i, Cell c) {
        // TODO Update any dependencies 
        matrix.get(i.row).set(i.col, c);
    }

    public Table getCols(List<Integer> cols) {
        // TODO get col with header if present
        return new Table(rows, cols.size());
    }

    public void validate(List<List<String>> data) {
        // TODO go over the cells and validate them
        return;
    }

    // Assumes the data has been validated
    public void populate(List<List<String>> data) {
        Set<Index> remaining = Index.generate(rows, cols);
        while(!remaining.isEmpty()) {
            populate(data, remaining.iterator().next(), remaining);
        }
    }

    private Cell populate(List<List<String>> data, Index index, Set<Index> remaining) {
        if (!remaining.contains(index)) {
            // This cell has already been populated
            return get(index);
        }

        String value = data.get(index.row).get(index.col);
        Cell cell;

        Matcher intMatch = INT_PAT.matcher(value);
        Matcher floatMatch = FLOAT_PAT.matcher(value);
        Matcher stringActionMatch = STRING_ACTION_PAT.matcher(value);

        if (intMatch.find()) {
            cell = new NumericCell(new Integer(value));

        } else if (floatMatch.find()) {
            cell = new NumericCell(new Float(value));

        } else if (stringActionMatch.find()) {
            Index referenceIndex = new Index(stringActionMatch.group(1));
            Cell reference = populate(data, referenceIndex, remaining);
            StringActionCell c = new StringActionCell(stringActionMatch.group(0));
            c.setReference(reference);
            cell = c;
        } else {
            cell = new StringCell(value);
        }

        set(index, cell);
        remaining.remove(index);
        return get(index);
    }

    void print() {

        if (!headers.isEmpty()) {
            System.out.println(String.join(" ", headers));
        }

        for (List<Cell> row : matrix) {
            System.out.println(String.join(" ", row.stream().map(c -> c.toString()).collect(toList())));
        }

    }
}