module edu.atts.atividade2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.atts.atividade2 to javafx.fxml;
    exports edu.atts.atividade2;
}