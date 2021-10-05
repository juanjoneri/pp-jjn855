public class IntegerCell extends Cell<Integer> {

    private final Integer value;

    public IntegerCell(Integer value) {
        this.value = value;
    }

    public Integer evaluate() {
        return value;
    }
}