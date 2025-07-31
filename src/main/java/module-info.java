module com.bankingproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.graphics;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.bankingproject to javafx.fxml;
    exports com.bankingproject;
    exports com.bankingproject.controllers;
    exports com.bankingproject.controllers.Admin;
    exports com.bankingproject.controllers.Client;
    exports com.bankingproject.Models;
    exports com.bankingproject.Views;
}
