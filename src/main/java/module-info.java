module com.graficafx.graficafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.graficafx.graficafx to javafx.fxml;
    exports com.graficafx.graficafx;
}