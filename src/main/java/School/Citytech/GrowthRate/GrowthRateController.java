package School.Citytech.GrowthRate;

import School.Citytech.MainController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class GrowthRateController extends MainController{

    @FXML
    private Label lblMessage;

    @FXML
    private TextField textYear;

    @FXML
    private TextField textEnd;

    @FXML
    private TextField textBeg;

    @FXML
    private TextField textTotal;

    @FXML
    void onClick(ActionEvent event){
        double year = Double.parseDouble(textYear.getText());
        double end = Double.parseDouble(textEnd.getText());
        double start = Double.parseDouble(textBeg.getText());
        double total = Double.parseDouble(textTotal.getText());

        var result = GrowthRateModel.getGrowRate(year,end, start,total);
        lblMessage.setText("Rate of Return is "+result + "%");
    }




}
