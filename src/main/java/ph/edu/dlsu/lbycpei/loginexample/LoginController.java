package ph.edu.dlsu.lbycpei.loginexample;

// Author: MKC-Cobalt
// Date Created: Aug-16-2022
// Last Modified: Aug-16-2022


import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.io.IOException;

public class LoginController {
    @FXML
    private Label prompt;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    // Documentation: https://docs.oracle.com/javafx/2/ui_controls/password-field.htm

    User users;

    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        LoginApplication loginApp = new LoginApplication();
        if (username.getText().toString().equals("admin")
                && password.getText().toString().equals("1234")) {
            prompt.setText("Login SUCCESS! Access Granted ...");
            prompt.setTextFill(Color.rgb(21, 117, 84));
            PauseTransition pause = new PauseTransition(Duration.seconds(1));
            pause.setOnFinished(e -> {
                try {
                    loginApp.changeScene("login-success.fxml");
                    pause.play();
                    loginApp.changeScene("admin-view.fxml");

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
            pause.play();
        } else if (username.getText().isEmpty() || password.getText().isEmpty()) {
            prompt.setText("Enter your username & password!");
            prompt.setTextFill(Color.rgb(210, 39, 30));
        } else {
            prompt.setText("Wrong Username or Password!");
            prompt.setTextFill(Color.rgb(210, 39, 30));
        }
    }
    @FXML
    private void handleCreation(ActionEvent event) throws IOException {
        users.setName(username.getText());
        users.setPassword(password.getText());
        users.setAccessLevel(1);
    }

    @FXML
    private void onExit(ActionEvent e) {
        Platform.exit();
    }
}