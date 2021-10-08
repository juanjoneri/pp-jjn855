import java.util.List;
import java.util.ArrayList;

public class NumericActionCell extends Cell<Float> {

    private final List<Cell<Float>> references; // TODO rename to children
    private Operation op;

    public NumericActionCell(Operation op) {
        super(Cell.Type.INT);
        this.references = new ArrayList();
        this.op = op;
    }


    public NumericActionCell(String opName) {
        this(opName.equals("__sum__") ? Operation.SUM : Operation.AVG);
        if (this.op.equals(Operation.AVG)) {
            this.type = Cell.Type.FLOAT;
        }
    }

    public void addReference(Cell<Float> reference) {
        if (reference.getType().equals(Cell.Type.FLOAT)) {
            this.type = Cell.Type.FLOAT;
        }
        references.add(reference);
    }

    public void removeReference(Cell<Float> reference) {
        // check remaining references are type int to change type to int
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

    enum Operation {
        SUM, AVG
    }
}