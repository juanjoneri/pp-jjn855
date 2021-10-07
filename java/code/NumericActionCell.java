import java.util.List;
import java.util.ArrayList;

public class NumericActionCell extends Cell<Float> {

    private final List<Cell<Float>> references;
    private Operation op;

    public NumericActionCell(Operation op) {
        this.references = new ArrayList();
        this.op = op;
    }


    public NumericActionCell(String opName) {
        this.references = new ArrayList();
        if (opName.equals("__sum__")) {
            op = Operation.SUM;
        } else {
            op = Operation.AVG;
        }
    }

    public void addReference(Cell<Float> reference) {
        references.add(reference);
    }

    public void removeReference(Cell<Float> reference) {
        references.remove(reference);
    }

    public boolean hasReference(Cell<Float> reference) {
        return references.contains(reference);
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
        String castedValue = getType().equals(Cell.Type.INT) 
            ? new Integer(value.intValue()).toString() 
            : value.toString();
        return getType() + ":" + castedValue;
    }

    enum Operation {
        SUM, AVG
    }
}