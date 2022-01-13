package School.Citytech.newabccounter;

import School.Citytech.MainController;
import School.Citytech.newabccounter.model.Mode;
import com.jbbwebsolutions.http.utility.JSONGet;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ResourceBundle;


public class ABCController extends MainController implements Initializable {

    @FXML
    private GridPane gridABC;

    @FXML
    private Label lblTitle;
    @FXML
    private ToggleGroup tgMode;

    @FXML
    private ComboBox<Mode> cbHighlight;


    @FXML
    void selectionMode(ActionEvent event) {
        Node node = (Node) event.getSource();
        if (node.getUserData().toString().equals("Z")) {
           alphabets(true);
            loadABCOption();

        }
        else if (node.getUserData().toString().equals("A")) {
            alphabets(false);
            loadABCOption();

        }
        //-----------------------------------------------------------------
        else if(node.getUserData().toString().equals("1")){
            number();
            loadNumbersOption();
        }else if (node.getUserData().toString().equals("3")) {
            var reverse = true;
            number(reverse);
            loadNumbersOption();
        }
        //-----------------------------------------------------------------
        else if(node.getUserData().toString().equals("5")){
            Five();
            loadFiveOption();
        }else if(node.getUserData().toString().equals("15")){
            var reverse = true;
            Five(reverse);
            loadFiveOption();
        }
        System.out.println(node.getUserData());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        alphabets(false);
        loadABCOption();
    }

    private  void loadABCOption(){

        var list = new ArrayList<Mode>();


        list.add(new Mode( "n", "none"));
        list.add(new Mode("v", "vowel"));
        list.add(new Mode("c", "consonant"));

        var abcList = FXCollections.observableArrayList(list);
        cbHighlight.setItems(abcList);


        var stage = super.anchorPane.getScene();
        super.anchorPane.setMinHeight(573);
        

    }




    private  void loadNumbersOption(){

        var list = new ArrayList<Mode>();

        list.add(new Mode( "n", "none"));
        list.add(new Mode("even", "even number"));
        list.add(new Mode("odd", "odd number"));
        list.add(new Mode("six", "every 6 numbers"));
        list.add(new Mode("fourNine", "contains #4 or 9"));


        var numList = FXCollections.observableArrayList(list);
        cbHighlight.setItems(numList);


    }

    private void loadFiveOption(){

        var list = new ArrayList<Mode>();
        list.add(new Mode( "n", "none"));
        list.add(new Mode("even", "even number"));
        list.add(new Mode("odd", "odd number"));

        list.add(new Mode("sixs", "every 6 numbers"));
        list.add(new Mode("fourNine", "contains #4 or 9"));

        var numLists = FXCollections.observableArrayList(list);
        cbHighlight.setItems(numLists);

    }


    public void alphabets(boolean reverse) {
        String sURL = "http://localhost:9615/alphabets/abc";
        var abc = JSONGet.submitGet(sURL, String[].class);

        if (reverse){
            Arrays.sort(abc, Collections.reverseOrder());
        }

        System.out.println(Arrays.toString(abc));
        gridABC.getChildren().clear();

        int column = 0, row = 0;
        for (var x : abc) {
            Button btn = new Button(x);

            btn.getStyleClass().add("abcNew");
            gridABC.add(btn, column++, row);
            if (column > 4) {
                row++;
                column = 0;
            }
        }
    }

    public void number( boolean...option ){
        String sURL = "http://localhost:9615/numbers/123";
        var numberXflip = JSONGet.submitGet(sURL, Integer[].class);

        if (option.length > 0 && option[0]== true){
            Arrays.sort(numberXflip, Collections.reverseOrder());
        }

        System.out.println(Arrays.toString(numberXflip));
        gridABC.getChildren().clear();
        int column = 0, row = 0;
        for (var x : numberXflip) {
            Button btn = new Button(x+"");

            btn.getStyleClass().add("abc");
            gridABC.add(btn, column++, row);
            if (column > 7) {
                row++;
                column = 0;
            }
        }

    }

    public void Five( boolean...option ){
        String sURL = "http://localhost:9615/numbers/5";
        var numberFive = JSONGet.submitGet(sURL, Integer[].class);

        if (option.length > 0 && option[0]== true){
            Arrays.sort(numberFive, Collections.reverseOrder());
        }

        System.out.println(Arrays.toString(numberFive));
        gridABC.getChildren().clear();
        int column = 0, row = 0;
        for (var x : numberFive) {
            Button btn = new Button(x+"");

            btn.getStyleClass().add("abc");
            gridABC.add(btn, column++, row);
            if (column > 7) {
                row++;
                column = 0;
            }
        }

    }


    @FXML
    void highlightAction(ActionEvent event){

        var selectedModel = cbHighlight.getSelectionModel();
        var current = selectedModel.getSelectedItem();

        if (current==null){
            return;
        }
        System.out.println(current.getMode()+""+current.getDescription());

        var buttons = gridABC.getChildren().stream().map(e -> (Button)e).toList();


        for (Button b: buttons) {
            b.getStyleClass().removeAll("highLight");

        }

        if (current.getMode().equals("c"))
            for (Button b: buttons) {
                if (ABCService.isConsonant(b.getText()))
                    b.getStyleClass().add("highLight");
            }

        if (current.getMode().equals("v"))
            for (Button b: buttons) {
                if (ABCService.isVowel(b.getText()))
                    b.getStyleClass().add("highLight");
            }
        if (current.getMode().equals("even"))
            for (Button b: buttons) {
                if (ABCService.isEven(b.getText()))
                    b.getStyleClass().add("highLight");
            }
        if (current.getMode().equals("odd"))
            for (Button b: buttons) {
                if (ABCService.isOdd(b.getText()))
                    b.getStyleClass().add("highLight");
            }

        if (current.getMode().equals("n"))
            for (Button b: buttons) {
                b.getStyleClass().removeAll("highLight");
            }

        if (current.getMode().equals("six"))
            for (Button b: buttons) {
                if (ABCService.isSix(b.getText())) {
                    b.getStyleClass().add("highLight");
                }

            }
        if (current.getMode().equals("fourNine"))
            for (Button b: buttons) {
                if (ABCService.isfourNine(b.getText()))
                    b.getStyleClass().add("highLight");
            }

        if (current.getMode().equals("sixs"))
            for (Button b: buttons) {
                if (ABCService.isSixs(b.getText())) {
                    b.getStyleClass().add("highLight");
                }

            }





    }


}
