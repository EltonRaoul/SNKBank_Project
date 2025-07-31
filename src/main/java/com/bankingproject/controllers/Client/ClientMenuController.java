/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.bankingproject.controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
 
import javafx.scene.control.Button;
/**
 * FXML Controller class
 *
 * @author Elton Raoul
 */
public class ClientMenuController implements Initializable {


    @FXML
    public Button dashboard_btn;
    @FXML
    public Button transaction_btn;
    @FXML
    public Button account_btn;
    @FXML
    public Button profil_btn;
    @FXML
    public Button logout_btn;
    @FXML
    public Button report_btn;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
