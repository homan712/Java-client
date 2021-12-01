package School.Citytech.properties;

import School.Citytech.MainController;
import School.Citytech.properties.model.Data;
import School.Citytech.retirement.CustomTableCell;
import School.Citytech.retirement.RetirementDataLayer;
import School.Citytech.retirement.model.Year;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class propertiesController extends MainController implements Initializable {

   
    @FXML
    private TableView<Data> tvProperties;


    @FXML
    private TableColumn<Data, Float> TableID;

    @FXML
    private TableColumn<Data , Float> tcCost;

    @FXML
    private TableColumn<Data , Float> tcGrossIncome;

    @FXML
    private TableColumn<Data , Float> tcExpenses;

    @FXML
    private TableColumn<Data , Float> tcNetIncome;

    @FXML
    private TableColumn<Data , Float> tcOccupancy;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        var investments = PropertiesDataLayer.getProperties().getInvestments();
        ObservableList<Data> oData = tvProperties.getItems();
        oData.addAll(investments);

        tcCost.setCellFactory( column-> {
            var cell = new CustomTableCell();
            return cell;
        });
        tcGrossIncome.setCellFactory( column-> {
            var cell = new CustomTableCell();
            return cell;
        });
        tcExpenses.setCellFactory( column-> {
            var cell = new CustomTableCell();
            return cell;
        });
        tcNetIncome.setCellFactory( column-> {
            var cell = new CustomTableCell();
            return cell;
        });
        tcOccupancy.setCellFactory( column-> {
            var cell = new CustomTableCell();
            return cell;
        });
    }
}
