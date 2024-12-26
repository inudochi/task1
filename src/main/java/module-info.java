module com.task8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.task8 to javafx.fxml;
    exports com.task8;
}