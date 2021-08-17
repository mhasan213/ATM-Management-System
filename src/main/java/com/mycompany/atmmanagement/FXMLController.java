package com.mycompany.atmmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class FXMLController implements Initializable {

    @FXML
    private Button button;

    @FXML
    private TextField userfield;

    @FXML
    private PasswordField passfield;

    @FXML
    private Label label;

    @FXML
    private void onLogin(ActionEvent event) throws IOException {
        String username = userfield.getText();
        String password = passfield.getText();

        if (username.equals("admin") && password.equals("admin")) {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/Menu.fxml"));

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            scene.getStylesheets().add("/styles/Styles.css");
            Image icon = new Image("/images/user.png");
            stage.getIcons().add(icon);

            stage.setTitle("User Home");
            stage.setScene(scene);
            stage.show();
            label.setText("Login");
        } else {
            userfield.setText("");
            passfield.setText("");
            label.setText("Username and Password don't match");
        }
    }

    @FXML
    private void onCancel(ActionEvent event) {
        userfield.setText("");
        passfield.setText("");
        label.setText("Cancelled");
    }

    @FXML
    private void onSignup(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/Signup.fxml"));
        loader.load();
        Parent root = loader.getRoot();

        Scene scene = new Scene(root);

        scene.getStylesheets().add("/styles/Styles.css");

        Image icon = new Image("/images/sicon.png");
        stage.getIcons().add(icon);

        stage.setResizable(false);
        stage.sizeToScene();
        stage.setTitle("Sign Up");

        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
