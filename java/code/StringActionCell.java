public class StringActionCell extends Cell<String> {

    private final Cell<String> reference;
    private Operation op;

    public StringActionCell(Cell<String> reference, Operation op) {
        this.reference = reference;
        this.op = op;
    }

    public String evaluate() {
        String base = reference.evaluate();
        return op.equals(Operation.TO_UPPER) ? base.toUpperCase() : base.toLowerCase();
    }

    enum Operation {
        TO_UPPER, TO_LOWER
    }
}