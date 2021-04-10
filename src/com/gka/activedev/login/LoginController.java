package com.gka.activedev.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginController implements Initializable {

    private final String TAG = LoginController.class.getName();

    @FXML
    private TextField usernameEditText;

    @FXML
    private PasswordField passwordEditText;

    @FXML
    private Button loginButton;

    @FXML
    private Label errorLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginButton.disableProperty().bind(
                usernameEditText.textProperty().isEmpty()
                        .or(passwordEditText.textProperty().isEmpty())
        );

    }

    @FXML
    void loginButtonAction(ActionEvent event) {
        if (usernameEditText.getText().equals("username")
                && passwordEditText.getText().equals("password")) {
            navigateToRegistrationPage(event);
        }else {
            errorLabel.setTextFill(Color.TOMATO);
            errorLabel.setText("Wrong username or password");
        }
    }

    private void navigateToRegistrationPage(ActionEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();

        Scene scene;
        try {
            scene = new Scene(FXMLLoader.load(getClass().getResource("/resources/fxml/registration.fxml")));
            stage.setScene(scene);
            stage.setTitle("Student Registration");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(TAG).log(Level.SEVERE, null, ex);
        }

    }
}
