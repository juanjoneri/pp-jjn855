public class NumericCell extends Cell<Float> {

    private final Float value;
    private final Cell.Type type;

    public NumericCell(float value) {
        this.value = value;
        this.type = Cell.Type.FLOAT;
    }

    public NumericCell(double value) {
        this.value = new Double(value).floatValue();
        this.type = Cell.Type.FLOAT;
    }

    public NumericCell(int value) {
        this.value = new Integer(value).floatValue();
        this.type = Cell.Type.INT;
    }

    public NumericCell(long value) {
        this.value = new Long(value).floatValue();
        this.type = Cell.Type.INT;
    }

    @Override
    public Float evaluate() {
        return value;
    }

    @Override
    public Cell.Type getType() {
        return type;
    }

    @Override
    public String toString() {
        if (type.equals(Cell.Type.INT)) {
            return new Integer(value.intValue()).toString();
        }
        return value.toString();
    }
}