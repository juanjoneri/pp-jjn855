public class NumericCell extends Cell<Float> {

    private final Float value;

    public NumericCell(float value) {
        super(Cell.Type.FLOAT);
        this.value = value;
    }

    public NumericCell(double value) {
        super(Cell.Type.FLOAT);
        this.value = new Double(value).floatValue();
    }

    public NumericCell(int value) {
        super(Cell.Type.INT);
        this.value = new Integer(value).floatValue();
    }

    public NumericCell(long value) {
        super(Cell.Type.INT);
        this.value = new Long(value).floatValue();
    }

    @Override
    public Float evaluate() {
        return value;
    }
}