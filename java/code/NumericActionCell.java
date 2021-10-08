import java.util.List;
import java.util.ArrayList;

public class NumericActionCell extends ActionCell<Float> {

    public NumericActionCell(String operation, String name) {
        super(Cell.Type.FLOAT,
            operation.equals("__sum__") 
                ? ActionCell.Operation.SUM 
                : ActionCell.Operation.AVG,
            name);
    }

    // Used to create a summary cell
    public NumericActionCell(ActionCell.Operation operation, List<Cell> children) {
        super(Cell.Type.FLOAT, operation, "");
        children.forEach(this::addChild);
    }

    @Override
    public Cell.Type getType() {
        if (getOperation().equals(ActionCell.Operation.SUM) 
            && getChildren().stream().allMatch(r -> r.getType().equals(Cell.Type.INT))) {
            return Cell.Type.INT;
        }
        return Cell.Type.FLOAT;
    }

    @Override
    public Float evaluate() {
        Float sum = 0f;
        for (Cell<Float> r : getChildren()) {
            sum += r.evaluate();
        }
        
        return getOperation().equals(ActionCell.Operation.SUM) ? sum : (sum / getChildren().size());
    }
}