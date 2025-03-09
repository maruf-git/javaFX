module com.example.javafx2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafx2 to javafx.fxml;
    exports com.example.javafx2;
}