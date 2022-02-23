module com.mycompany.tester {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tester to javafx.fxml;
    exports com.mycompany.tester;
}
