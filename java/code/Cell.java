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

    @Override
    public String toString() {
        String name = evaluate().toString();

        if (getType().equals(Type.FLOAT)) {
            name = new Float(name).toString();
        }
        if (getType().equals(Type.INT)) {
            name = new Integer(new Float(name).intValue()).toString();
        }

        return getType() + ":" + name;
    }

    enum Type {
        STRING, FLOAT, INT
    }

}