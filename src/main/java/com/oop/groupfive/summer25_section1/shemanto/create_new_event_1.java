package com.oop.groupfive.summer25_section1.shemanto;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class create_new_event_1 {
    @javafx.fxml.FXML
    private TextField venueTextfield;
    @javafx.fxml.FXML
    private DatePicker eventdateDatePicker;
    @javafx.fxml.FXML
    private TextArea descriptionTextarea;
    @javafx.fxml.FXML
    private TextField eventTimeTextfield;
    @javafx.fxml.FXML
    private TextField eventTitleTextField;

    @javafx.fxml.FXML
    public void saveEventOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cancelOnAction(ActionEvent actionEvent) {
    }
}
