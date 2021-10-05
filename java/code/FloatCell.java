public class FloatCell extends Cell<Float> {

    private final Float value;
    private final boolean isInt;

    public FloatCell(Float value) {
        this.value = value;
        this.isInt = false;
    }

    public FloatCell(Integer value) {
        this.value = value.floatValue();
        this.isInt = true;
    }

    public Float evaluate() {
        return value;
    }

    @Override
    public String toString() {
        if (isInt) {
            return new Integer(value.intValue()).toString();
        }
        return value.toString();
    }
}