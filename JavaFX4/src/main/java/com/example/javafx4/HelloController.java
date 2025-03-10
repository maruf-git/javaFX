package com.example.javafx4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

//    @FXML
    public void up(ActionEvent e){
        System.out.println("up");
    }
    public void down(ActionEvent e){
        System.out.println("Down");
    }
    public void left(ActionEvent e){
        System.out.println("left");
    }
    public void right(ActionEvent e){
        System.out.println("right");
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}