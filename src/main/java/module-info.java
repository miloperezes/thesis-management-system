module ph.edu.dlsu.lbycpei.loginexample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens ph.edu.dlsu.lbycpei.loginexample to javafx.fxml;
    exports ph.edu.dlsu.lbycpei.loginexample;
}