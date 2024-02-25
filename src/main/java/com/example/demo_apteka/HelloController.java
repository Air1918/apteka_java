package com.example.demo_apteka;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private TextField email_field;

    @FXML
    private Button enterButton;

    @FXML
    private TextField name_field;

    @FXML
    private Button singUpButton1;

    @FXML
    void PrivateFieldKeyTyped(KeyEvent event) {

    }

    @FXML
    void initialize() {
        singUpButton1.setOnAction(event -> {
            System.out.println("Регистрация прошла успешна!");
        });
    }

}
