import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Condition.RelCond r = new Condition.RelCond("($1==some_string) || ($header_name<>5)");
            System.out.println(r);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.out.println(e.getMessage());
            } else {
                System.out.println("OTHER ERROR");
            }
        }
    }
}
