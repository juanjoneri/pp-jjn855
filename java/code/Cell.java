import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class Cell<T> {

    Type type;

    public Cell(Type type){
        this.type = type;
    }

    public abstract T evaluate();

    public Type getType() {
        return type;
    }

    public void checkType(Type... others) {
        if (!Arrays.asList(others).contains(getType())) {
            throw new RuntimeException("TYPE ERROR");
        }
    }

    public boolean lt(Cell other) {
        if (hasType(Type.STRING) || other.hasType(Type.STRING)) {
            return false;
        }
        return new Float(evaluate().toString()) < new Float(other.evaluate().toString());
    }

    public boolean gt(Cell other) {
        if (hasType(Type.STRING) || other.hasType(Type.STRING)) {
            return false;
        }
        return new Float(evaluate().toString()) > new Float(other.evaluate().toString());
    }

    public boolean eq(Cell other) {
        if (hasType(Type.STRING) && hasType(Type.STRING)
            || !hasType(Type.STRING) && !hasType(Type.STRING) ) {
            return evaluate().toString().equals(other.evaluate().toString());
        }
        return false;
    }

    private boolean hasType(Type t) {
        return getType().equals(t);
    }

    @Override
    public String toString() {
        String name = evaluate().toString();

        if (hasType(Type.FLOAT)) {
            name = new Float(name).toString();
        }
        if (hasType(Type.INT)) {
            name = new Integer(new Float(name).intValue()).toString();
        }

        return name;
    }

    enum Type {
        STRING, FLOAT, INT
    }

}