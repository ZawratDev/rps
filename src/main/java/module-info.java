module com.example.rpsgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rpsgame to javafx.fxml;
    exports com.example.rpsgame;
}