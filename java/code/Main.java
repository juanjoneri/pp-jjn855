import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cell s = new StringCell("hELlO");
        Cell upperS = new StringActionCell(s, StringActionCell.Operation.TO_UPPER);
        Cell lowerS = new StringActionCell(upperS, StringActionCell.Operation.TO_LOWER);
        Cell i = new NumericCell(100);
        System.out.println(i);

        Cell a = new NumericCell(10f);
        Cell b = new NumericCell(50.6d);
        Cell c = new NumericCell(0.0);
        Cell sum = new NumericActionCell(Arrays.asList(a,b,c), NumericActionCell.Operation.SUM);
        Cell avg = new NumericActionCell(Arrays.asList(a,b,c), NumericActionCell.Operation.AVG);
        System.out.println(sum);
    }
}
