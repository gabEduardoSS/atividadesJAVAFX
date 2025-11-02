package edu.atts.atividade2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import org.w3c.dom.Text;

public class temp {
    @FXML
    private TextField celsius;
    @FXML
    private TextField fahr;
    @FXML
    private Label aviso;
    @FXML
    private Label resultado;

    @FXML
    private void blockTF(KeyEvent event) {
        Object origem = event.getSource();
        String digitado = event.getCharacter();
        String charTemp = "";
        String tf = "";

        if (origem == celsius) {
            fahr.setDisable(true);
            charTemp = "C";
            tf = celsius.getText();
            if(celsius.getText().isEmpty()){
                fahr.setDisable(false);
            }
        } else if (origem == fahr) {
            celsius.setDisable(true);
            charTemp = "F";
            tf = fahr.getText();
            if(fahr.getText().isEmpty()){
                celsius.setDisable(false);
            }
        }

        if (!digitado.matches("[0-9]|.")){
            event.consume();
        } else if(!charTemp.isEmpty() && !tf.isEmpty()){
            converter(tf, charTemp);
        } else{
            resultado.setText("Cº = Fº");
        }
    }

    private void converter(String tf, String charTemp){
        double temp = Double.parseDouble(tf);
        String PH = "%.2f Cº = %.2f Fº";
        if(charTemp.equals("C")){
            resultado.setText(String.format(PH, temp, (temp*9/5)+32));
        } else if(charTemp.equals("F")){
            resultado.setText(String.format(PH, (temp-32)*5/9, temp));
        }
    }
}