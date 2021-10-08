import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public abstract class ActionCell<T> extends Cell<T> {

    Operation operation;
    Set<Cell<T>> children;
    String representation;

    public ActionCell(Type type, Operation operation, String representation) {
        super(type);
        this.operation = operation;
        this.children = new HashSet();
        this.representation = representation;
    }

    public void fix() {
        representation = super.toString();
    }

    public Set<Cell<T>> getChildren() {
        return children;
    }

    public void addChild(Cell<T> child) {
        validateChild(child);
        children.add(child);
    }

    public void removeChild(Cell<T> child) {
        children.remove(child);
    }

    public boolean hasChild(Cell<T> child) {
        return children.contains(child);
    }

    public Operation getOperation() {
        return this.operation;
    }

    private void validateChild(Cell<T> child) {
        if (Arrays.asList(Operation.SUM, Operation.AVG).contains(getOperation())) {
            child.checkType(Cell.Type.FLOAT, Cell.Type.INT);
        } else {
            child.checkType(Cell.Type.STRING);
        }
    }

    @Override
    public String toString() {
        // By default will return the representation.
        // To print evaluated cell first need to fix();
        return representation;
    }

    enum Operation {
        SUM, AVG,
        TO_UPPER, TO_LOWER
    }

}