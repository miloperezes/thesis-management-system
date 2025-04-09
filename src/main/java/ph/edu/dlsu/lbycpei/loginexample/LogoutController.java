// Author: MKC-Cobalt
// Date Created: Aug-16-2022
// Last Modified: Aug-16-2022

package ph.edu.dlsu.lbycpei.loginexample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;



public class LogoutController {

//    @FXML
//    private Button logoutButton;

    @FXML
    private void onLogout(ActionEvent e) throws IOException {
        LoginApplication loginApp = new LoginApplication();
        loginApp.changeScene("login-view.fxml");
    }
}
