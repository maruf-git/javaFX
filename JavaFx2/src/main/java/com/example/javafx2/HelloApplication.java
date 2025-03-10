package com.example.javafx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();

        Scene scene = new Scene(root, Color.BLACK);
        stage.setTitle("Barta - Desktop Application");
//        Image icon = new Image("/src/icon.png");
        Image icon = new Image(Objects.requireNonNull(getClass().getResource("/icon.png")).toExternalForm());
        stage.getIcons().add(icon);

        stage.setX(100);
        stage.setY(500);
        stage.setWidth(500);
        stage.setHeight(300);

        stage.setResizable(false);
        stage.setFullScreen(true);

        stage.setFullScreenExitHint("Press q to exit");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        stage.show();
    }
}

//public class HelloApplication extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
//}