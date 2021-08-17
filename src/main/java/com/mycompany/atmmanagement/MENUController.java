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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MENUController implements Initializable {

    @FXML
    public void logoutAction(ActionEvent event) throws Exception {

        ((Node) (event.getSource())).getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Logout.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        Image icon = new Image("/images/logouticon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Logged Out");
        stage.setResizable(false);
        stage.sizeToScene();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void onUserinfo(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/UserInfo.fxml"));
        loader.load();
        Parent root = loader.getRoot();

        Scene scene = new Scene(root);

        scene.getStylesheets().add("/styles/Styles.css");

        Image icon = new Image("/images/userinfo.png");
        stage.getIcons().add(icon);

        stage.setResizable(false);
        stage.sizeToScene();
        stage.setTitle("User Information");

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void onDeposit(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/DepositPage.fxml"));
        loader.load();
        Parent root = loader.getRoot();

        Scene scene = new Scene(root);

        scene.getStylesheets().add("/styles/Styles.css");

        Image icon = new Image("/images/depoicon.png");
        stage.getIcons().add(icon);

        stage.setResizable(false);
        stage.sizeToScene();
        stage.setTitle("Deposit Money");

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void onCheck(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/BalancePage.fxml"));
        loader.load();
        Parent root = loader.getRoot();

        Scene scene = new Scene(root);

        scene.getStylesheets().add("/styles/Styles.css");

        Image icon = new Image("/images/accountbalance.png");
        stage.getIcons().add(icon);

        stage.setResizable(false);
        stage.sizeToScene();
        stage.setTitle("Check Balance");

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void onWithdraw(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/WithdrawPage.fxml"));
        loader.load();
        Parent root = loader.getRoot();

        Scene scene = new Scene(root);

        scene.getStylesheets().add("/styles/Styles.css");

        Image icon = new Image("/images/withdraw.png");
        stage.getIcons().add(icon);

        stage.setResizable(false);
        stage.sizeToScene();
        stage.setTitle("Withdraw Money");

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void onTransfer(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/BalanceTransfer.fxml"));
        loader.load();
        Parent root = loader.getRoot();

        Scene scene = new Scene(root);

        scene.getStylesheets().add("/styles/Styles.css");

        Image icon = new Image("/images/transfer.png");
        stage.getIcons().add(icon);

        stage.setResizable(false);
        stage.sizeToScene();
        stage.setTitle("Balance Transfer");

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void onChange(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/PasswordReset.fxml"));
        loader.load();
        Parent root = loader.getRoot();

        Scene scene = new Scene(root);

        scene.getStylesheets().add("/styles/Styles.css");

        Image icon = new Image("/images/pass.png");
        stage.getIcons().add(icon);

        stage.setResizable(false);
        stage.sizeToScene();
        stage.setTitle("Password Reset");

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void onEdit(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/Editinfo.fxml"));
        loader.load();
        Parent root = loader.getRoot();

        Scene scene = new Scene(root);

        scene.getStylesheets().add("/styles/Styles.css");

        Image icon = new Image("/images/editinfo.png");
        stage.getIcons().add(icon);

        stage.setResizable(false);
        stage.sizeToScene();
        stage.setTitle("Edit Profile");

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void onDelete(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/Deleteaccount.fxml"));
        loader.load();
        Parent root = loader.getRoot();

        Scene scene = new Scene(root);

        scene.getStylesheets().add("/styles/Styles.css");

        Image icon = new Image("/images/delete.png");
        stage.getIcons().add(icon);

        stage.setResizable(false);
        stage.sizeToScene();
        stage.setTitle("Delete account");

        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
