package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.awt.*;

class DivisorException extends Exception{
    public DivisorException(String message){
        super(message);
    }
}
public class Controller {
    @FXML
    private TextField number1;
    @FXML
    private TextField number2;
    @FXML
    private Button button;
    @FXML
    private Label result;


    @FXML
    public void initialize(){
        button.setDisable(true);
    }
    @FXML
    public void onButtonClicked() {

        try {
            double n1 = Double.parseDouble(number1.getText());
            double n2 = Double.parseDouble(number2.getText());
            double r = divideN(n1,n2);
//                    System.out.println(r);
            result.setText(String.valueOf(r));
        } catch (NumberFormatException ex) {
            result.setText("Katie asks u to \n look carefully \n at ur nrs;)");
        } catch (DivisorException dex){
            result.setText(dex.getMessage());
        }
    }
    @FXML
    public void onClearClicked() {
        number1.clear();
        number2.clear();
        result.setText("");
    }
    @FXML
    public void handleKeyReleased(){
        String n1 = number1.getText();
        String n2 = number2.getText();
        boolean disableButton = n1.isEmpty() || n1.trim().isEmpty() || n2.isEmpty() || n2.trim().isEmpty();
        button.setDisable(disableButton);
    }

    public static double divideN(double a, double b) throws DivisorException{
        double r = a/b;
        if(b ==0){
            throw new DivisorException("Divisor cannot \n be 0 \n (" + r + ")");
        }
        if(b == 13){
            throw new DivisorException("Katie doesn't \n like number 13");
        }
        return r;
    }
}
