package School.Citytech.TicTacToe;

import School.Citytech.MainController;
import com.jbbwebsolutions.http.utility.JSONGet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class TicTacToeController extends MainController implements Initializable {

    @FXML
    private FlowPane fpGames;

    @FXML
    private Label lblURL;

    @FXML
    private Label lblStatus;

    @FXML
    private Button btnReset;

    private boolean isX = true;

    final String TEMPLATE_URL = "http://localhost:9615/game/tictactoe?moves=";


    @FXML
    void gameMoveClick(MouseEvent event) {
       Object object = event.getSource();
       Label label = (Label)object;

       lblStatus.setText("");

       if (!label.getText().equals("N")){
            lblStatus.setText("Invalid move, stop cheating");
            return;
       }

       String currentMove  = isX ? "x": "0";
       label.setText(currentMove);
       isX = !isX;

       var moves =  Arrays.stream(labels)
               .map(Label::getText).collect(Collectors.joining());
        var newURL = TEMPLATE_URL + moves;
        lblStatus.setText(newURL);

        TicTacToeModel model = JSONGet.submitGet(newURL, TicTacToeModel.class);

        System.out.println(model);

        if(model.isWinner()){
            Arrays.stream(model.getPosition())
                    .forEach (e->{
                        labels[e].getStyleClass().add("winner");
                    });
        }
    }


    private Label[] labels = new Label[9];



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        f_initialize();
    }
    public void p_initialize() {
        var children = fpGames.getChildren();
        int count = 0;
        for (Node node : children) {

                 Label label = (Label) node;
                 labels[count++] = label;
                 System.out.println(label);
             }
        }

        public void f_initialize() {
            labels = fpGames.getChildren().stream()
                    .map(e -> (Label)e)
                    .toArray(Label[]::new);

        }


        @FXML
        void reset(ActionEvent event){
         this.isX = true;  //this can make always start with X

          for (Label label: labels) {
              label.setText("N");
              label.getStyleClass().remove("winner");
          }
      }



}

