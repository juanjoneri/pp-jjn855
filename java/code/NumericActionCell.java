import java.util.List;

public class NumericActionCell extends Cell<Float> {

    private final List<Cell<Float>> references;
    private Operation op;

    public NumericActionCell(List<Cell<Float>> references, Operation op) {
        this.references = references;
        this.op = op;
    }

    @Override
    public Float evaluate() {
        Float sum = 0f;
        for (Cell<Float> r : references) {
            sum += r.evaluate();
        }
        
        return op.equals(Operation.SUM) ? sum : (sum / references.size());
    }

    @Override
    public Cell.Type getType() {
        if (op.equals(Operation.SUM) && references.stream().allMatch(r -> r.getType().equals(Cell.Type.INT))) {
            return Cell.Type.INT;
        }
        return Cell.Type.FLOAT;
    }

    @Override
    public String toString() {
        Float value = evaluate();
        return getType().equals(Cell.Type.INT) 
            ? new Integer(value.intValue()).toString() 
            : value.toString();
    }

    enum Operation {
        SUM, AVG
    }
}