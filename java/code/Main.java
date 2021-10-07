import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<String>> data = Arrays.asList(
            Arrays.asList("1", "2.1"), 
            Arrays.asList("__sum__([0,0],[0,1])", "4"));

        Table t = new Table(2, 2);
        t.populate(data);
        t.print();
    }
}
