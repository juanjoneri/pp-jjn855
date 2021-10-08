public class StringActionCell extends Cell<String> {

    private Cell<String> reference; // TODO rename to children
    private Operation op;

    public StringActionCell(Operation op) {
        super(Cell.Type.STRING);
        this.reference = null;
        this.op = op;
    }

    public StringActionCell(String opName) {
        this(opName.equals("__to_upper__") ? Operation.TO_UPPER : Operation.TO_LOWER);
    }

    public void setReference(Cell<String> reference) {
        this.reference = reference;
    }

    public boolean hasReference(Cell<Float> reference) {
        return this.reference.equals(reference);
    }

    @Override
    public String evaluate() {
        String base = reference.evaluate();
        return op.equals(Operation.TO_UPPER) ? base.toUpperCase() : base.toLowerCase();
    }

    enum Operation {
        TO_UPPER, TO_LOWER
    }
}