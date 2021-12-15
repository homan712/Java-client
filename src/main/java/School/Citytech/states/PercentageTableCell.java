package School.Citytech.states;
import javafx.scene.control.TableCell;

import java.text.DecimalFormat;

public class PercentageTableCell extends TableCell {

    private DecimalFormat formatts = new DecimalFormat("0.0%");

    @Override
    protected void updateItem(Object item, boolean isEmpty) {
        super.updateItem(item, isEmpty);

        System.out.println("item" + item + "empty" + isEmpty);
        setText(null);
        if(!isEmpty)
            setText(formatts.format(item));
    }
}
