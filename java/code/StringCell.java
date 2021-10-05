public class StringCell extends Cell<String> {

    private final String value;

    public StringCell(String value) {
        this.value = value;
    }

    @Override
    public String evaluate() {
        return value;
    }

    @Override
    public Cell.Type getType() {
        return Cell.Type.STRING;
    }
}