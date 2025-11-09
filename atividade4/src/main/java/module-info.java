module projeto.teste.atividade4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens projeto.teste.atividade4 to javafx.fxml;
    exports projeto.teste.atividade4;
}