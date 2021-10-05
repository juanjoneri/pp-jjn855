import java.util.List;

public class NumericActionCell extends Cell<Float> {

    private final List<Cell<Float>> references;
    private Operation op;

    public NumericActionCell(List<Cell<Float>> references, Operation op) {
        this.references = references;
        this.op = op;
    }

    public Float evaluate() {
        Float sum = 0f;
        for (Cell<Float> r : references) {
            sum += r.evaluate();
        }
        
        return op.equals(Operation.SUM) ? sum : (sum / references.size());
    }

    enum Operation {
        SUM, AVG
    }
}