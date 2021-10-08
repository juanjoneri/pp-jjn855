import static java.util.stream.Collectors.toList;

import java.util.Collections;
import java.util.Arrays;
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

    public void fixCell(Index i) {
        Cell target = get(i);
        if (target instanceof ActionCell) {
            ((ActionCell) target).fix();
        }
    }

    public Cell get(Index i) {
        if (i.row >= rows || i.col >= cols) {
            throw new RuntimeException("INDEX ERROR");
        }
        return values.get(i.row).get(i.col);
    }

    public void set(Index i, Cell c) {
        // TODO Update any dependencies 
        values.get(i.row).set(i.col, c);
    }

    public void remove(Index i) {
        values.get(i.row).remove(i.col);
    }

    public void setHeaders(List<String> headers) {
        this.headers = new ArrayList(headers);
    }

    public boolean hasHeaders() {
        return !this.headers.isEmpty();
    }

    public List<String> getHeaders() {
        return this.headers;
    }

    List<List<String>> getRepr() {
        List<List<String>> repr = new ArrayList();
        if (!headers.isEmpty()) {
            repr.add(headers);
        }
        for (List<Cell> row : values) {
            repr.add(row.stream().map(c -> c.toString()).collect(toList()));
        }
        return repr;
    }

    void print() {
        for (List<String> row : getRepr()) {
            System.out.println(String.join(" ", row));
        }

    }
}