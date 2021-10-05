public abstract class Cell<T> {

    public abstract T evaluate();

    @Override
    public String toString() {
        return evaluate().toString();
    }

}