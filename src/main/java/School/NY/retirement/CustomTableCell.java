package School.Citytech.retirement;

import javafx.scene.control.TableCell;

import java.text.DecimalFormat;

public class CustomTableCell extends TableCell {

    private DecimalFormat format1 = new DecimalFormat("###,###.00");

    @Override
    protected void updateItem(Object item, boolean isEmpty) {
        super.updateItem(item, isEmpty);

        System.out.println("item " + item + "empty" + isEmpty);
        setText(null);
        if(!isEmpty)
        setText(format1.format(item));
    }
}
