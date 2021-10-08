public abstract class Cell<T> {

    Type type;

    public Cell(Type type){
        this.type = type;
    }

    public abstract T evaluate();

    public Type getType() {
        return type;
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