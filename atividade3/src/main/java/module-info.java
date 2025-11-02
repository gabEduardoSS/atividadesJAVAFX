module projeto.teste.atividade3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens projeto.teste.atividade3 to javafx.fxml;
    exports projeto.teste.atividade3;
}