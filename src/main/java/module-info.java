module com.example.abstractclass {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.desktop;


    opens com.task1 to javafx.fxml;
    exports com.task1;
    exports com.task1.module;
    opens com.task1.module to javafx.fxml;
}