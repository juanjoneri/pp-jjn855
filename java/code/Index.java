import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Index {

    private static Pattern INDEX_PAT = Pattern.compile("\\[([0-9]+),([0-9]+)\\]");

    public int row;
    public int col;

    public Index(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Index(String name) {
        Matcher m = INDEX_PAT.matcher(name);
        m.find();
        this.row = Integer.parseInt(m.group(1));
        this.col = Integer.parseInt(m.group(2));
    }

    public static List<Index> generate(int rows, int cols) {
        List<Index> indices = new LinkedList();
        for (int row = 0; row < rows; row ++) {
            for (int col = 0; col < cols; col ++) {
                indices.add(new Index(row, col));
            }
        }
        return indices;
    }

    public static List<Index> generate(String names) {
        List<Index> indices = new LinkedList();
        Matcher match = INDEX_PAT.matcher(names);
        while(match.find()) {
            indices.add(new Index(match.group(0)));
        }
        return indices;
    }

    public static List<Index> generateCol(int rows, int col) {
        List<Index> indices = new LinkedList();
        for (int row = 0; row < rows; row ++) {
            indices.add(new Index(row, col));
        }
        return indices;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Index)) {
            return false;
        }

        Index other = (Index) o;
        return this.row == other.row && this.col == other.col;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public String toString() {
        return String.format("Index{row=%d, col=%d}", row, col);
    }
}