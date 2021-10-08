import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<String>> data = Arrays.asList(
            Arrays.asList("A",                    "B",                   "C"), 
            Arrays.asList("-11",                  "__to_lower__([0,2])", "__to_upper__([2,2])"), 
            Arrays.asList("1",                    "22",                  "__avg__([1,0],[0,0])"), 
            Arrays.asList("__sum__([0,0],[0,0])", "4.0",                 "alOha"));

        try {
            Table t = new TableBuilder(data, /*hasHeaders*/ true).validate().build();
            System.out.println(t.sum(0));
            t.fixCols(Arrays.asList(2, 1));
            t.print(Arrays.asList(0, 1));
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.out.println(e.getMessage());
            } else {
                System.out.println("OTHER ERROR");
            }
        }
    }
}
