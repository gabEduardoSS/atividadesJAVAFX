package projeto.teste.atividade3;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Pessoa {
    @FXML
    private TextField nome;
    @FXML
    private TextField idade;
    @FXML
    private ComboBox<String> sexo;
    @FXML
    private CheckBox esporte;

    @FXML
    protected void analise(){

    }
}
