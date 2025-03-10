package com.example.javafx3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();// creating root for nodes
        Scene scene = new Scene(root,900,700,Color.CHOCOLATE);// creating scene
        stage.setScene(scene);// setting the scene to the stage

//         set application title
        stage.setTitle("Barta -Desktop Application");
//        setting application logo/icon
        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);

//        adding text node to the scene and then stage it
        Text text = new Text();
        text.setText("WOOOOOA!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Arial",50));
        text.setFill(Color.AQUA);
        root.getChildren().add(text); // adding text to the scene

//        adding line node to the scene and then stage it
        Line line = new Line();
        line.setStartX(0);
        line.setStartY(70);
        line.setEndX(500);
        line.setEndY(70);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(5);
        line.setOpacity(.5);
//        line.setRotate(45);
        root.getChildren().add(line); // adding line to the scene

//        adding rectangle node to the scene and then stage it
        Rectangle rectangle = new Rectangle();
        rectangle.setX(50);
        rectangle.setY(150);
        rectangle.setWidth(300);
        rectangle.setHeight(250);
        rectangle.setFill(Color.BLUE);
        rectangle.setStrokeWidth(20);
        rectangle.setStroke(Color.BLACK);
        root.getChildren().add(rectangle); // adding rectangle to the scene

//        adding triangle node to the scene and then stage it
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                300.0,300.0,
                300.0,500.0,
                600.0,500.0
        );
        triangle.setFill(Color.AQUAMARINE);
        triangle.setStroke(Color.RED);
        triangle.setStrokeWidth(10);
        root.getChildren().add(triangle); // adding triangle to the scene

//        adding circle node to the scene and then stage it
        Circle circle = new Circle();
        circle.setCenterX(250);
        circle.setCenterY(250);
        circle.setRadius(50);
        circle.setFill(Color.RED);
        circle.setStroke(Color.GREEN);
        circle.setStrokeWidth(10);
        root.getChildren().add(circle); // adding circle to the scene

//        adding ImageView node to the scene and then stage it
        Image pizzaImgIm = new Image("pizza.png");
        ImageView pizzaImg = new ImageView(pizzaImgIm);
        pizzaImg.setX(400);
        pizzaImg.setY(400);
        root.getChildren().add(pizzaImg);

        stage.show(); // displaying the stage
    }

    public static void main(String[] args){
        launch();
    }
}