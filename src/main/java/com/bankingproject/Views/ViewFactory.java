package com.bankingproject.Views;

import com.bankingproject.controllers.Client.ClientController;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elton Raoul
 */
public class ViewFactory {
    
    //Client Views
    private AnchorPane dashboardView;
    private  AnchorPane transactionsView;
    
    public ViewFactory(){   
    }
    
    public AnchorPane getDashboardView(){
        //If the dashboardView have not be loaded
        if(dashboardView == null){
            try {
                dashboardView = new FXMLLoader(getClass().getResource("/FXML/Client/Dashboard.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            } 
        }
        return dashboardView;
    }
    
        public AnchorPane getTransactionsView(){
        //If the dashboardView have not be loaded
        if(transactionsView == null){
            try {
                dashboardView = new FXMLLoader(getClass().getResource("/FXML/Client/Transaction.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return transactionsView;
    }
    
    
    public void showLoginWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Login.fxml"));
        System.out.println("HelloWorld");
        createStage(loader);
    }
    
    public void ShowClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Client/Client.fxml"));
        //ClientController clientController = new ClientController();
        //loader.setController(clientController);  
        createStage(loader);
    }
    
    public void createStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("SNK Bank");
        stage.show();
    }
    
    public void closeStage(Stage stage){
        stage.close();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
