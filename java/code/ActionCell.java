import java.util.Set;
import java.util.HashSet;

public abstract class ActionCell<T> extends Cell<T> {

    Operation operation;
    Set<Cell<T>> children;

    public ActionCell(Type type, Operation operation) {
        super(type);
        this.operation = operation;
        this.children = new HashSet();
    }

    public Set<Cell<T>> getChildren() {
        return children;
    }

    public void addChild(Cell<T> child) {
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

    enum Operation {
        SUM, AVG,
        TO_UPPER, TO_LOWER
    }

}