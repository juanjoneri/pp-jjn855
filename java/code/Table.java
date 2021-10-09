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

    public void fixCols(List<Integer> cols) {
        for (Integer col : cols) {
            validateCol(col);
            Index.generateCol(rows, col).forEach(this::fix);
        }

    }

    public void fix(Index i) {
        validateIndex(i);
        Cell target = get(i);
        if (target instanceof ActionCell) {
            ((ActionCell) target).fix();
        }
    }

    public Cell get(Index i) {
        validateIndex(i);
        return values.get(i.row).get(i.col);
    }

    public void set(Index i, Cell c) {
        validateIndex(i);
        values.get(i.row).set(i.col, c);
    }

    public void update(Index i, String name) {
        validateIndex(i);
        int adjustedRow = i.row + (hasHeaders() ? 1 : 0);
        List<List<String>> repr = getRepr();
        repr.get(adjustedRow).set(i.col, name);   
        this.values = new TableBuilder(repr, hasHeaders()).validate().build().values;    
    }

    public void setHeaders(List<String> headers) {
        this.headers = new ArrayList(headers);
    }

    public boolean hasHeaders() {
        return !headers.isEmpty();
    }

    public List<String> getHeaders() {
        return headers;
    }

    public String sum(int col) {
        validateCol(col);
        List<Cell> chilren = Index.generateCol(rows, col).stream().map(this::get).collect(toList());
        return new NumericActionCell(ActionCell.Operation.SUM, chilren).fix().toString();
    }

    private List<List<String>> getRepr() {
        List<List<String>> repr = new ArrayList();
        if (hasHeaders()) {
            repr.add(getHeaders());
        }
        for (List<Cell> row : values) {
            repr.add(row.stream().map(c -> c.toString()).collect(toList()));
        }
        return repr;
    }

    public void print(List<Integer> cols) {
        cols.forEach(this::validateCol);
        for (List<String> row : getRepr()) {
            List<String> filteredRow = new ArrayList();
            for (Integer col : cols) {
                filteredRow.add(row.get(col));
            }
            System.out.println(String.join(" ", filteredRow));
        }

    }

    private void validateCol(int col) {
        if (col < 0 || col >= cols) {
            throw new RuntimeException("COL INDEX ERROR");
        }
    }

    private void validateIndex(Index i) {
        if (i.row < 0 || i.col < 0 || i.row >= rows || i.col >= cols) {
            throw new RuntimeException("INDEX ERROR");
        }
    }
}