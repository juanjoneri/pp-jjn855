import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.HashSet;

public class Index {

    private static Pattern INDEX_PAT = Pattern.compile("^\\[(\\d+),(\\d+)\\]$");

    public int row;
    public int col;

    public Index(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Index(String index) {
        Matcher m = INDEX_PAT.matcher(index);
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