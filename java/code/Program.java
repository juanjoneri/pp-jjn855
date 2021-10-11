import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class Program {

    private Table table;

    public Program(String inFile, boolean header) {

        List<List<String>> data = new ArrayList();
        for (String line : Io.read(inFile)) {
            List<String> row = Arrays.asList(line.split("\\s+"));
            data.add(row);
        }
        table = new TableBuilder(data, header).validate().build();
    }

    public void print(List<Integer> cols, String outFile) {
        if (cols.isEmpty()) {
            cols = table.allCols();
        }
        Io.write(table.printCols(cols), outFile);
    }

    public void sum(int col, String outFile) {
        Io.write(table.sum(col), outFile);
    }

    public void action(List<Integer> cols) {
        if (cols.isEmpty()) {
            cols = table.allCols();
        }
        table.fixCols(cols);        
    }

    public void when(String c) {
        Set<Integer> rows = new HashSet(table.notEquals(0, new Condition.Value(""))); // Start with all rows

        Condition condition = new Condition(c);
        Condition.RelCond next = condition.next();
        while (next != null) {
            
            int col = table.getColIndex(next.exp.col);
            Condition.Value value = next.exp.value;
            Condition.Exp.Op op = next.exp.op;

            List<Integer> newRows = new ArrayList();
            switch (op) {
                case LT:
                    newRows = table.lessThan(col, value);
                    break;
                case GT:
                    newRows = table.greaterThan(col, value);
                    break;
                case NE:
                    newRows = table.notEquals(col, value);
                    break;
                case EQ:
                    newRows = table.equals(col, value);
                    break;
            }

            if (next.relOp.equals(Condition.RelCond.RelOp.AND)) {
                rows.retainAll(newRows);
            } else {
                rows.addAll(newRows);
            }
            next = condition.next();
        }
        List<Integer> sortedRows = new ArrayList(rows);
        Collections.sort(sortedRows);
        System.out.println(table.printRows(sortedRows));
    }

    public void update(int row, int col, String value) {
        table.update(new Index(row, col), value);
    }
}