module edu.atts.atividade1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.atts.atividade1 to javafx.fxml;
    exports edu.atts.atividade1;
}