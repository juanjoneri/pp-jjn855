import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<String>> data = Arrays.asList(
            Arrays.asList("A", "B", "C"), 
            Arrays.asList("-11", "__to_lower__([0,2])", "__to_upper__([2,2])"), 
            Arrays.asList("1", "22", "__avg__([1,1],[2,0])"), 
            Arrays.asList("__sum__([0,0],[1,1])", "4.0", "hola"));

        Table t = new TableBuilder(data, /*hasHeaders*/ true).build();
        t.print();
    }
}
