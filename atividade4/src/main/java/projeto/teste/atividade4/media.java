package projeto.teste.atividade4;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class media {
    @FXML
    private TextField nomeTF;
    @FXML
    private TextField nota1TF;
    @FXML
    private TextField nota2TF;
    @FXML
    private TextField nota3TF;

    @FXML
    private Label resultadoLB;
    @FXML
    private Label avisoLB;

    @FXML
    public void calcularMedia(){
        String nome =  nomeTF.getText().isEmpty() ? "Não identificado" : nomeTF.getText();
        String[] notasStr = {nota1TF.getText(), nota2TF.getText(), nota3TF.getText()};

        if(!notasStr[0].isEmpty() || !notasStr[1].isEmpty() || !notasStr[2].isEmpty()){
            if(String.format(notasStr[0] + notasStr[1] + notasStr[2]).matches("[0-9]+")){
                Double[] notasDbl = {Double.parseDouble(notasStr[0]), Double.parseDouble(notasStr[1]), Double.parseDouble(notasStr[2])};
                double media = (notasDbl[0]+notasDbl[1]+notasDbl[2])/3;

                String situacao;
                if(media >= 7){
                    situacao = "Aprovado";
                } else if(media >= 4){
                    situacao = "Recuperação";
                } else{
                    situacao = "Reprovado";
                }

                resultadoLB.setPadding(new Insets(15));
                resultadoLB.setText(String.format("%s — %s — %s", nome, (String.format("%.2f", media)), situacao));
            }
        }
    }
}
