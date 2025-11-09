package projeto.teste.atividade3;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Pessoa {
    @FXML
    private TextField nomeTF;
    @FXML
    private TextField idadeTF;
    @FXML
    private ComboBox<String> sexoCB;
    @FXML
    private CheckBox esporteCB;

    @FXML
    private Label nomeLB;
    @FXML
    private Label idadeLB;
    @FXML
    private Label sexoLB;
    @FXML
    private Label esporteLB;
    @FXML
    private Label maiorLB;
    @FXML
    private Label avisoLB;

    @FXML
    public void analise(){
        String nome =  nomeTF.getText();
        String idade = idadeTF.getText();
        String sexo = sexoCB.getSelectionModel().getSelectedItem();
        String esporte = esporteCB.isSelected() ? "Pratica" : "Não pratica";
        avisoLB.setText("");


        if(!nome.isEmpty() && !idade.isEmpty()){
            if(idade.matches("[0-9]*")){
                if(!sexo.equalsIgnoreCase("sexo")){
                    nomeLB.setText(String.format("%s", nome));
                    idadeLB.setText(String.format("%s", idade));
                    sexoLB.setText(String.format("%s", sexo));
                    esporteLB.setText(String.format("%s esportes", esporte));
                    maiorLB.setText(Integer.parseInt(idade) >= 18 ? "Sim" : "Não");
                } else {
                    avisoLB.setText("Insira um sexo");
                }
            } else {
                avisoLB.setText("O campo idade aceita apenas números");
            }
        } else {
            avisoLB.setText("Preencha todos os campos");
        }
    }
}
