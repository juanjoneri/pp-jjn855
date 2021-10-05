public class FloatCell extends Cell<Float> {

    private final Float value;

    public FloatCell(Float value) {
        this.value = value;
    }

    public Float evaluate() {
        return value;
    }
}