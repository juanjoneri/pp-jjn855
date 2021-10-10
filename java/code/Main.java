import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Program p = new Program("../tests/2.txt", true);
            p.when("($0>2) && ($A<20) || ($2<>5)");
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.out.println(e.getMessage());
            } else {
                System.out.println("OTHER ERROR");
            }
        }
    }
}
