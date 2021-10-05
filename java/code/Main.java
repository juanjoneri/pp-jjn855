import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cell s = new StringCell("hELlO");
        Cell upperS = new StringActionCell(s, StringActionCell.Operation.TO_UPPER);
        Cell lowerS = new StringActionCell(upperS, StringActionCell.Operation.TO_LOWER);
        Cell i = new NumericCell(100);
        System.out.println(i);

        Cell a = new NumericCell(10);
        Cell b = new NumericCell(20);
        Cell c = new NumericCell(0);
        Cell sum = new NumericActionCell(Arrays.asList(a,b,c), NumericActionCell.Operation.SUM);
        Cell avg = new NumericActionCell(Arrays.asList(a,b,c), NumericActionCell.Operation.AVG);
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sum.getType());
    }
}
