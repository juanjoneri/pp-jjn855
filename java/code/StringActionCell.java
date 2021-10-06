public class StringActionCell extends Cell<String> {

    private Cell<String> reference;
    private Operation op;

    public StringActionCell(Operation op) {
        this.reference = null;
        this.op = op;
    }

    public StringActionCell(String opName) {
        this.reference = null;
        if (opName.equals("__to_upper__")) {
            op = Operation.TO_UPPER;
        } else {
            op = Operation.TO_LOWER;
        }
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

    @Override
    public Cell.Type getType() {
        return Cell.Type.STRING;
    }

    enum Operation {
        TO_UPPER, TO_LOWER
    }
}