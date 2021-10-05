public class Main {

    public static void main(String[] args) {
        Cell s = new StringCell("hELlO");
        Cell upperS = new StringActionCell(s, StringActionCell.Operation.TO_UPPER);
        Cell lowerS = new StringActionCell(upperS, StringActionCell.Operation.TO_LOWER);
        System.out.println(lowerS.evaluate());
    }
}
