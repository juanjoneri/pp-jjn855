public class StringCell extends Cell<String> {

    private final String value;

    public StringCell(String value) {
        super(Cell.Type.STRING);
        this.value = value;
    }

    @Override
    public String evaluate() {
        return value;
    }
}