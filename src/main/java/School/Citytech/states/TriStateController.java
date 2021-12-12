package School.Citytech.states;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class TriStateController implements Initializable {


        @FXML
        private PieChart pieTriState;

        @FXML
        private TableView<?> tvStateInfo;

        @FXML
        private Button btnRefresh;

        @FXML
        private Label lblTitle;

        @FXML
        private TableColumn<TriState, Float> tcId;

        @FXML
        private TableColumn<TriState, Float> tcCost;

        @FXML
        private TableColumn<TriState, Float> tcState;

        @FXML
        private TableColumn<TriState, Float> tcPercentage;

        @FXML
        private TableColumn<TriState, Float> tcNetIncome;





        void refreshData(){
                var list = TriStateDataLayer.getData("NY","NJ","CT");

               for (var property: list){
                       PieChart.Data slice = new PieChart.Data(property.getState(),
                               property.getSumOfNetIncome());
                       pieTriState.getData().add(slice);
               }
        }


        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                this.refreshData();
        }
}


