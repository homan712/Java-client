package School.Citytech.retirement;

import School.Citytech.MainController;
import School.Citytech.retirement.model.Year;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class retirementController extends MainController implements Initializable {


    @FXML
    private TableView<Year> tvRetirement;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        var years = RetirementDataLayer.getRetirement().getYears();
        ObservableList<Year> oYears = tvRetirement.getItems();
        oYears.addAll(years);
    }
}
