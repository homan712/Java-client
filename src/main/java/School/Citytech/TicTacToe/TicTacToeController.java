package School.Citytech.TicTacToe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ResourceBundle;

public class TicTacToeController implements Initializable {

    @FXML
    private FlowPane fpGames;

    @FXML
    private Label lblURL;

    @FXML
    private Label lblStatus;

    @FXML
    private Button btnReset;

    private boolean isX = true;

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
          }
      }



}

