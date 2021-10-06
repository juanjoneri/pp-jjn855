import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<String>> data = Arrays.asList(
            Arrays.asList("-1", "-2.0"), 
            Arrays.asList("zanahoria", "4"));

        Table t = new Table(2, 2);
        t.populate(data);
        t.print();
    }
}
