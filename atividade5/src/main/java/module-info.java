module projeto.teste.atividade5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens projeto.teste.atividade5 to javafx.fxml;
    exports projeto.teste.atividade5;
}