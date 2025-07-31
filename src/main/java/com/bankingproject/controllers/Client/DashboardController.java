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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Elton Raoul
 */
public class DashboardController implements Initializable {

    @FXML
    public Text user_name;
    @FXML
    public Label login_date;
    @FXML
    public Label checking_bal;
    @FXML
    public Label checking_acc_num;
    @FXML
    public Label savings_bal;
    @FXML
    public Label savings_acc_num;
    @FXML
    public Label income_lbl;
    @FXML
    public Label expense_lbl;
    @FXML
    public ListView<?> transaction_listview;
    @FXML
    public TextField payee_fld;
    @FXML
    public TextField amount_fld;
    @FXML
    public TextArea message_fld;
    @FXML
    public Button send_money_btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
