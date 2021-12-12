package School.Citytech.pieChart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.beans.binding.Bindings;



public class PieChartExperiments extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("TriState Income");

        PieChart pieChart = new PieChart();

        var data  = TriStateDataSource.getData();

        data.forEach( realEstate -> {
            PieChart.Data slice = new PieChart.Data(realEstate.getState(), realEstate.getAmount());
            pieChart.getData().add(slice);
            ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(slice);
            pieChartData.forEach(e ->
                    e.nameProperty().bind(
                            Bindings.concat(
                                    e.getName(), " ", e.pieValueProperty(), " "
                            )
                    )
            );
        });

        VBox vbox = new VBox(pieChart);

        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.setHeight(300);
        primaryStage.setWidth(1200);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}