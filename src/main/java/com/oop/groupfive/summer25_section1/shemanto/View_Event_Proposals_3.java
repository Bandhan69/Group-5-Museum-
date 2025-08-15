package com.oop.groupfive.summer25_section1.shemanto;


import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;

import javax.swing.text.TableView;

public class View_Event_Proposals_3 {

    @javafx.fxml.FXML
    private TableColumn proposalstatusCol;
    @javafx.fxml.FXML
    private TableColumn proposalsubmitedbyCol;
    @javafx.fxml.FXML
    private TableColumn proposaldateCol;
    @javafx.fxml.FXML
    private TableColumn proposaltitleCol;
    @javafx.fxml.FXML
    private TextArea proposaldetailsTextarea;
    @javafx.fxml.FXML
    private TableView proposalTableview;

    @javafx.fxml.FXML
    public void proposaldetailsapproveOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void proposaldetailsrejectOnAction(ActionEvent actionEvent) {
    }
}
