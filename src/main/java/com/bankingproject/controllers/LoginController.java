/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bankingproject.controllers;

import com.bankingproject.Models.Model;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Elton Raoul
 */
public class LoginController implements Initializable{

    @FXML
    public ChoiceBox<?> acc_selector;
    @FXML
    public Label payee_address_lbl;
    @FXML
    public TextField payee_address_fld;
    @FXML
    public PasswordField password_fld;
    @FXML
    public Button login_byn;
    @FXML
    public Label error_lbl;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void handle_loginBtn(ActionEvent event) {
        onLogin();
    }
    
    public void onLogin() {
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().ShowClientWindow(); 
    }
    
}
