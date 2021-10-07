import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<String>> data = Arrays.asList(
            Arrays.asList("hOLa", "__to_lower__([0,0])"), 
            Arrays.asList("__to_upper__([0,1])", "4"));

        Table t = new Table(2, 2);
        t.populate(data);
        t.print();
    }
}
