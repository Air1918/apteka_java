module com.example.demo_apteka {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo_apteka to javafx.fxml;
    exports com.example.demo_apteka;
}