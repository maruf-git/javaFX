module com.example.javafx4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx4 to javafx.fxml;
    exports com.example.javafx4;
}