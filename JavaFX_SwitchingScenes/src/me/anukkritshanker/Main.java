package me.anukkritshanker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application  {

    Stage window1;
    Scene sc1,sc2;


    public static void main(String[] args) {
	  launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window1 = primaryStage;
        String str="This is scene 1";
        Label label1= new Label(str);
        Button button1= new Button("Next->");
        button1.setOnAction(e -> window1.setScene(sc2));

        // layout for scene 1
        VBox lay1 = new VBox();
        lay1.getChildren().addAll(label1,button1);
        sc1 = new Scene(lay1,400,400);



        Label label = new Label("THIS IS SCENE 2");
        Button button2 = new Button("Back <-");
        button2.setOnAction(event -> window1.setScene(sc1));

        //layout for scene 2
        StackPane lay2 = new StackPane();
        lay2.getChildren().addAll(label,button2);
        sc2 = new Scene(lay2,600,600);
        //without show method it will not show
        primaryStage.setScene(sc1);
        primaryStage.setTitle("Lets Switch Screen");
        primaryStage.show();



    }
}
