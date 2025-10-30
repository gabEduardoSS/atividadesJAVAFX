package edu.atts.atividade1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calc {
    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private Label resultado;
    @FXML
    private Label aviso;

    @FXML
    public void checkBotaoClicado(ActionEvent event){
        Button botaoClicado = (Button) event.getSource();
        String op = botaoClicado.getText();
        if(!t1.getText().isEmpty() || !t2.getText().isEmpty()){
            calcular(op);
        } else{
            aviso.setText("Preencha os dois campos!");
        }
    }

    public void calcular(String op) {
        String res;
        double n1 = Double.parseDouble(t1.getText());
        double n2 = Double.parseDouble(t2.getText());
        res = switch (op) {
            case "+" -> Double.toString(n1 + n2);
            case "-" -> Double.toString(n1 - n2);
            case "*" -> Double.toString(n1 * n2);
            case "/" -> Double.toString(n1 / n2);
            default -> "ERRO";
        };
        if(op.equals("/") && n2 == 0){
            aviso.setText("Impossivel dividir por zero!");
        } else{
            printRes(res);
        }

    }

    public void printRes(String res){
        resultado.setText(String.format("Resultado: %s", res));
    }

}