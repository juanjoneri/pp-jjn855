import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private List<String> headers;
    private List<List<Cell>> values;
    private int rows;
    private int cols;

    public Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.headers = new ArrayList(cols);
        this.values = new ArrayList(rows);
        for (int r = 0; r < rows; r ++) {
            values.add(new ArrayList(cols));
            for (int c = 0; c < cols; c++) {
                values.get(r).add(null);
            }
        }
    }

    public Cell get(Index i) {
        return values.get(i.row).get(i.col);
    }

    public void set(Index i, Cell c) {
        // TODO Update any dependencies 
        values.get(i.row).set(i.col, c);
    }

    void print() {

        if (!headers.isEmpty()) {
            System.out.println(String.join(" ", headers));
        }

        for (List<Cell> row : values) {
            System.out.println(String.join(" ", row.stream().map(c -> c.toString()).collect(toList())));
        }

    }
}