package School.Citytech.retirement;

import School.Citytech.MainController;
import School.Citytech.retirement.model.Year;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class retirementController extends MainController implements Initializable {


    @FXML
    private TableView<Year> tvRetirement;

    @FXML
    private TextField txtYear;

    @FXML
    private TableColumn<Year , Float> tcStartingBalance;

    @FXML
    private TableColumn<Year , Float> tcYearlyDeposit;

    @FXML
    private TableColumn<Year , Float> tcInterestEarned;

    @FXML
    private TableColumn<Year , Float> tcEndingBalance;



    @FXML
  void onClick(){
        tvRetirement.getItems().clear();
        var years = RetirementDataLayer.getRetirement(txtYear.getText()).getYears();
        ObservableList<Year> oYears = tvRetirement.getItems();
        oYears.addAll(years);
  }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //populateTable(30);
        var years = RetirementDataLayer.getRetirement("30").getYears();
        ObservableList<Year> oYears = tvRetirement.getItems();
        oYears.addAll(years);

        tcStartingBalance.setCellFactory( column-> {
            var cell = new CustomTableCell();
            return cell;
        });
        tcYearlyDeposit.setCellFactory( column-> {
            var cell = new CustomTableCell();
            return cell;
        });
        tcInterestEarned.setCellFactory( column-> {
            var cell = new CustomTableCell();
            return cell;
        });
        tcEndingBalance.setCellFactory( column-> {
            var cell = new CustomTableCell();
            return cell;
        });
    }
}