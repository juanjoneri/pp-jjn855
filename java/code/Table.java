import static java.util.stream.Collectors.toList;

import java.util.HashSet;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    public int getColIndex(String header) {
        if (!hasHeaders() || !getHeaders().contains(header)) {
            throw new RuntimeException("COL INDEX ERROR");
        }
        return getHeaders().indexOf(header);
    }

    public int getColIndex(Condition.Value indexOrHeader) {
        if (indexOrHeader.isNumeric()) {
            int col = indexOrHeader.getFloat().intValue();
            validateCol(col);
            return col;
        }
        return getColIndex(indexOrHeader.getString());
    }

    public List<Integer> equals(int col, Condition.Value value) {
        List<Integer> matchingRows = new ArrayList();
        for (int row = 0; row < rows; row ++) {
            Cell cell = get(new Index(row, col));
            String cellValue = cell.evaluate().toString();
            boolean isMatchingString = value.isString() && cell.eq(new StringCell(value.getString()));
            boolean isMatchingNumber = value.isNumeric() && cell.eq(new NumericCell(value.getFloat()));
            if (isMatchingString || isMatchingNumber) {
                matchingRows.add(row);
            }
        }
        return matchingRows;
    }

    public List<Integer> notEquals(int col, Condition.Value value) {
        List<Integer> matchingRows = new ArrayList();
        List<Integer> equalsRows = equals(col, value);
        for (int row = 0; row < rows; row ++) {
            if (!equalsRows.contains(row)) {
                matchingRows.add(row);
            }
        }
        return matchingRows;
    }

    public List<Integer> lessThan(int col, Condition.Value value) {
        List<Integer> matchingRows = new ArrayList();
        for (int row = 0; row < rows; row ++) {
            Cell cell = get(new Index(row, col));
            String cellValue = cell.evaluate().toString();
            boolean isMatchingString = value.isString() && cell.lt(new StringCell(value.getString()));
            boolean isMatchingNumber = value.isNumeric() && cell.lt(new NumericCell(value.getFloat()));
            if (isMatchingString || isMatchingNumber) {
                matchingRows.add(row);
            }
        }
        return matchingRows;
    }

    public List<Integer> greaterThan(int col, Condition.Value value) {
        List<Integer> matchingRows = new ArrayList();
        for (int row = 0; row < rows; row ++) {
            Cell cell = get(new Index(row, col));
            String cellValue = cell.evaluate().toString();
            boolean isMatchingString = value.isString() && cell.gt(new StringCell(value.getString()));
            boolean isMatchingNumber = value.isNumeric() && cell.gt(new NumericCell(value.getFloat()));
            if (isMatchingString || isMatchingNumber) {
                matchingRows.add(row);
            }
        }
        return matchingRows;
    }

    public void fixCols(List<Integer> cols) {
        if (cols.isEmpty()) {
            cols = allCols();
        }
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

    public String printCols(List<Integer> cols) {
        cols.forEach(this::validateCol);
        List<Integer> sortedCols = new ArrayList(new HashSet(cols));
        Collections.sort(sortedCols);
        String out = "";
        for (List<String> row : getRepr()) {
            List<String> filteredRow = new ArrayList();
            for (Integer col : sortedCols) {
                filteredRow.add(row.get(col));
            }
            out += String.join(" ", filteredRow) + "\n";
        }
        return out;
    }

    public void filterRows(List<Integer> rows) {
        rows.forEach(this::validateRow);
        List<List<String>> data = new ArrayList();
        List<List<String>> repr = getRepr();
        for (Integer row: rows) {
            int adjustedRow = row + (hasHeaders() ? 1 : 0);
            data.add(repr.get(adjustedRow));
        }
        this.rows = rows.size();
        this.values = new TableBuilder(data, false).validate().build().values;
    }

    private void validateCol(int col) {
        if (col < 0 || col >= cols) {
            throw new RuntimeException("COL INDEX ERROR");
        }
    }

    private void validateRow(int row) {
        if (row < 0 || row >= rows) {
            throw new RuntimeException("ROW INDEX ERROR");
        }
    }

    private void validateIndex(Index i) {
        if (i.row < 0 || i.col < 0 || i.row >= rows || i.col >= cols) {
            throw new RuntimeException("INDEX ERROR");
        }
    }

    public List<Integer> allCols() {
        List<Integer> cols = new ArrayList();
        for (int i = 0; i < this.cols ; i++) {
            cols.add(i);
        }
        return cols;
    }
}