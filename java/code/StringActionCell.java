public class StringActionCell extends ActionCell<String> {

    public StringActionCell(String operation) {
        super(Cell.Type.STRING, 
            operation.equals("__to_upper__") 
                ? ActionCell.Operation.TO_UPPER 
                : ActionCell.Operation.TO_LOWER);
    }

    @Override
    public String evaluate() {
        String base = getChildren().iterator().next().evaluate(); // Can only have 1 child
        return getOperation().equals(ActionCell.Operation.TO_UPPER) 
            ? base.toUpperCase() 
            : base.toLowerCase();
    }

}