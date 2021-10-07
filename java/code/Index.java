import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.HashSet;

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

    public static Set<Index> generate(int rows, int cols) {
        Set<Index> indices = new HashSet();
        for (int r = 0; r < rows; r ++) {
            for (int c = 0; c < cols; c ++) {
                indices.add(new Index(r, c));
            }
        }
        return indices;
    }

    public static Set<Index> generate(String names) {
        Set<Index> indices = new HashSet();
        Matcher match = INDEX_PAT.matcher(names);
        while(match.find()) {
            indices.add(new Index(match.group(0)));
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