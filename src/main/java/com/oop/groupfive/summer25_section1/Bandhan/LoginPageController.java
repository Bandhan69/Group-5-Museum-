package com.oop.groupfive.summer25_section1.Bandhan;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPageController
{
    @javafx.fxml.FXML
    private TextField userIDTextField;
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createAccountOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loginOnAction(ActionEvent actionEvent) {
        String id, password;
        boolean flag = true;

        Alert erroralert = new Alert(Alert.AlertType.ERROR);

        id = userIDTextField.getText();
        password = passwordPasswordField.getText();

        if (id.strip().isBlank()){
            flag =false;
            erroralert.setTitle("User ID Error");
            erroralert.setContentText("User ID can not be blank");
        }
        if (password.isBlank()){
            flag =false;
            erroralert.setTitle("Password ID Error");
            erroralert.setContentText("Password  can not be blank");
        }

        if (flag) {
            if (id.length()==7){
                // login as a Visitor
            }

            else if (id.length()==4){
                // login as a Receptionist
            }

            else if(id.length()==5){
                // login as a Admin
            }

            else {
                erroralert.setTitle("User ID Error");
                erroralert.setContentText("User ID type does not be exist.");
            }
        }
    }
}