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

    public void removeCols(Integer... toRemove) {
        List<Integer> targets = Arrays.asList(toRemove);
        Collections.sort(targets);
        System.out.println(targets);

        for (int i = targets.size() - 1; i >= 0; i--) {
            cols -= 1;
            int target = targets.get(i);
            if (hasHeaders()) {
                headers.remove(target);
            }
            Index.generateCol(rows, target).forEach(this::remove);
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
        // TODO Update any dependencies 
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

    void print() {

        if (!headers.isEmpty()) {
            System.out.println(String.join(" ", headers));
        }

        for (List<Cell> row : values) {
            System.out.println(String.join(" ", row.stream().map(c -> c.toString()).collect(toList())));
        }

    }
}