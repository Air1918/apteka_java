package com.example.demo_apteka;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class SingInController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button RegisterButton;

    @FXML
    private Button SingInButton;

    @FXML
    private ImageView githubSingUpButton;

    @FXML
    private ImageView gooleSingUpButton;

    @FXML
    private TextField name_field;

    @FXML
    private PasswordField passwordPrivate;

    @FXML
    private ImageView vkSingUpButton;

    @FXML
    void PasswordFieldKeyTyped(KeyEvent event) {

    }

    @FXML
    void initialize() {

    }

}


