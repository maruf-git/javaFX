package com.example.javafx4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;
    public void up(ActionEvent e){
        System.out.println("up");
        myCircle.setCenterY(y=y-10);
    }
    public void down(ActionEvent e){
        System.out.println("Down");
        myCircle.setCenterY(y=y+10);
    }
    public void left(ActionEvent e){
        System.out.println("left");
        myCircle.setCenterX(x=x-10);
    }
    public void right(ActionEvent e){
        System.out.println("right");
        myCircle.setCenterX(x=x+10);
    }

}
