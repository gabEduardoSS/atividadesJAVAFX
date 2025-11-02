module edu.atts.atividade2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.xml;

    opens edu.atts.atividade2 to javafx.fxml;
    exports edu.atts.atividade2;
}