public class NumericCell extends Cell<Float> {

    private final Float value;
    private final Type type;

    public NumericCell(float value) {
        this.value = value;
        this.type = Type.FLOAT;
    }

    public NumericCell(double value) {
        this.value = new Double(value).floatValue();
        this.type = Type.FLOAT;
    }

    public NumericCell(int value) {
        this.value = new Integer(value).floatValue();
        this.type = Type.INT;
    }

    public NumericCell(long value) {
        this.value = new Long(value).floatValue();
        this.type = Type.INT;
    }

    public Float evaluate() {
        return value;
    }

    @Override
    public String toString() {
        if (type.equals(Type.INT)) {
            return new Integer(value.intValue()).toString();
        }
        return value.toString();
    }

    enum Type {
        FLOAT, INT
    }
}