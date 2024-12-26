module com.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.task2 to javafx.fxml;
    exports com.task2;
}