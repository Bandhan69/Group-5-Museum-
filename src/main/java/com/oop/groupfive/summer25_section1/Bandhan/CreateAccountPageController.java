package com.oop.groupfive.summer25_section1.Bandhan;

import com.oop.groupfive.summer25_section1.AppendableObjectOutputStream;
import com.oop.groupfive.summer25_section1.Bandhan.Visitor.Visitor;
import com.oop.groupfive.summer25_section1.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class CreateAccountPageController
{
    @javafx.fxml.FXML
    private TextField phoneNoTextField;
    @javafx.fxml.FXML
    private TextArea addressTextField;
    @javafx.fxml.FXML
    private TextArea outputTaxtField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private DatePicker dobDP;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private PasswordField passwordTaxtField;
    @javafx.fxml.FXML
    private TextField emergencyContactTaxtField;
    private String email;
    @javafx.fxml.FXML
    private RadioButton othersRB;
    @javafx.fxml.FXML
    private RadioButton maleRB;
    @javafx.fxml.FXML
    private RadioButton femaleRB;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createAccountOnAction(ActionEvent actionEvent) {
        String name, email, phone,gender ="" ,address, password,emergency;
        LocalDate dob;
        boolean flag = true;

        name = nameTextField.getText();
        email = emailTextField.getText();
        phone = phoneNoTextField.getText();
        emergency = emergencyContactTaxtField.getText();
        password = passwordTaxtField.getText();
        address = addressTextField.getText();
        dob = dobDP.getValue();

        if (maleRB.isSelected()) {
            gender = "Male" ;
        }
        else if (femaleRB.isSelected()) {
            gender = "Female" ;
        }
        else if (othersRB.isSelected()) {
            gender = "Others" ;
        }

        Visitor visitor = new Visitor(name, phone, email, address, gender, password, dob, emergency);

        outputTaxtField.clear() ;
        outputTaxtField.setText(visitor.toString());

        nameTextField.clear() ;
        emailTextField.clear() ;
        phoneNoTextField.clear() ;
        emergencyContactTaxtField.clear() ;
        addressTextField.clear() ;
        passwordTaxtField.clear() ;
    }
    public void writePatient(Visitor visitor) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("VisitorData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
//                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(visitor);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }

    @javafx.fxml.FXML
    public void loginOA(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginPage.fxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }

}