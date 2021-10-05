public class StringCell extends Cell<String> {

    private final String value;

    public StringCell(String value) {
        this.value = value;
    }

    public String evaluate() {
        return value;
    }
}