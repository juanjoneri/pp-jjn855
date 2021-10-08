public abstract class ActionCell<T> {

    public abstract Cell<T> getChildren();

    public abstract Operation getOperation();

    enum Operation {
        SUM, AVG,
        TO_UPPER, TO_LOWER
    }

}