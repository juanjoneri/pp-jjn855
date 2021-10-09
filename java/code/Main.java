import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Program p = new Program("../tests/1.txt", false);
            p.print(Arrays.asList(1), "mioout.txt");
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.out.println(e.getMessage());
            } else {
                System.out.println("OTHER ERROR");
            }
        }
    }
}
