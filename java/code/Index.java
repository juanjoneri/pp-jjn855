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
        this.row = Integer.parseInt(m.group(0));
        this.col = Integer.parseInt(m.group(1));
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
}