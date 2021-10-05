public abstract class Cell<T> {

    public abstract T evaluate();

    public abstract Type getType();

    @Override
    public String toString() {
        return evaluate().toString();
    }

    enum Type {
        STRING, FLOAT, INT
    }

}