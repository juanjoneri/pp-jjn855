import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
        Io.write(table.printCols(cols), outFile);
    }

    public void sum(int col, String outFile) {
        Io.write(table.sum(col), outFile);
    }

    public void action(List<Integer> cols) {
        table.fixCols(cols);        
    }

    public void when(String condition) {
        List<Integer> rows = table.lessThan(0, new Condition.Value(20f));
        System.out.println(table.printRows(rows));
    }

    public void update(int row, int col, String value) {
        table.update(new Index(row, col), value);
    }
}