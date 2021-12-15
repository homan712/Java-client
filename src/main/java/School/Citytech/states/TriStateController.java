package School.Citytech.states;


import School.Citytech.MainController;
import School.Citytech.retirement.CustomTableCell;
import School.Citytech.states.model.Property;

import School.Citytech.states.model.TriState;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.function.Predicate;


public class TriStateController extends MainController implements Initializable {


    @FXML
    private PieChart pieTriState;

    @FXML
    private TableView<Property> tvStateInfo;

    @FXML
    private TableColumn<Property,Float> tcCost;

    @FXML
    private TableColumn<Property,Float> tcNetIncome;

    @FXML
    private TableColumn<Property,Float> tcPercentage;


    @FXML
    private Label lblStatus;
    @FXML
    private Button btnRefresh;

    @FXML
    private Label lblTitle;

    @FXML
    private FlowPane fpStates;





    TriState[] gList = TriStateDataLayer.getData();
    Predicate<TriState> nyTriState = x -> x.getState().equals("CT") ||
            x.getState().equals("NJ") || x.getState().equals("NY");


    void refreshData(Predicate<Property>predicate){
                var list = Arrays.stream(gList).filter(nyTriState).toList();

                var isPopulated = pieTriState.getData().size() > 0;

                if(!isPopulated)
               for (var property: list){
                       PieChart.Data slice = new PieChart.Data(property.getState(),
                               property.getSumOfNetIncome());
                       pieTriState.getData().add(slice);
               }


               tvStateInfo.getItems().clear();

               var property = TriStateDataLayer.getProperty();
               var listOfProperties = Arrays.stream(property).filter(predicate).toList();
               ObservableList<Property> oList = tvStateInfo.getItems();
               oList.addAll(listOfProperties);

                tcCost.setCellFactory( column-> {
                    var cell = new CustomTableCell();
                    return cell;
                });

                tcNetIncome.setCellFactory( column-> {
                    var cell = new CustomTableCell();
                    return cell;
                });

                tcPercentage.setCellFactory( column-> {
                    var cell = new PercentageTableCell();
                    return cell;
                });


        }


        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                System.out.println("confirmed");
                this.refreshData( e -> true);
                this.pieTriState.getData().forEach(this::clickOnPie);

                Arrays.stream(gList).forEach(e -> {
                    var checkBox = new CheckBox(e.getState());
                    checkBox.setPrefSize(60,15);
                    this.fpStates.getChildren().add(checkBox);
                    System.out.println(checkBox);
                });





                //4--more than 4 check box, hide button

            /**
            private void hideButton(ActionEvent event){
                if(event.checkbox > 4){
                    btnRefresh.setVisible(false);
                    lblStatus.setText("more than 4 states selected is invalid.");

                //#8 --less than 2 checkboxes, hide button
                }else if(event.checkbox < 2){
                 btnRefresh.setVisible(false);
                 lblStatus.setText("less than 2 states selected is invalid.");
             }


            }
             **/




            }







        void clickOnPie (PieChart.Data data){
                EventHandler<MouseEvent> eventHandler = evt -> {
                        System.out.println(evt);
                        System.out.println("name " + data.getName());
                        System.out.println("pieValue " + data.getPieValue());
                        Predicate<Property> predicate = e -> e.getState().equals(data.getName());
                        this.refreshData(predicate);

                        // #6 lbltitle change name
                        lblTitle.setText("TriState Income For: " + data.getName());
                };
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler);

        }




}



