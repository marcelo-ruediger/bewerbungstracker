module com.bewerbungstracker.bewerbungstracker_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.bewerbungstracker.bewerbungstracker_javafx to javafx.fxml;
    exports com.bewerbungstracker.bewerbungstracker_javafx;
}