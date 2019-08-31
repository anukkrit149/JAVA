package me.anukkritshanker;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Main extends Application  {
    int num=0;
    Button button;



    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("JAVAFX Application");

        button = new Button("LABEL");
        //anonymous inner class demonstrated in setonaction method

//        button.setOnAction(new EventHandler<ActionEvent>() {
//           @Override
//           public void handle(ActionEvent event) {
//               if (num==10)
//                   return;
//               num++;
//               System.out.println("No Of hits="+num);
//
//           }
//       });


        button.setOnAction(eventVAR -> {
            if (num==10)
                return;
            num++;
            System.out.println("No Of hits="+num);

        });


        StackPane layout = new StackPane();

        layout.getChildren().add(button);


        Scene scene = new Scene(layout,400,500);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

//    @Override
//    public void handle(ActionEvent event) {
//        if (event.getSource()==button)
//            System.out.println("Button Hit");
//
//    }
    public static void main(String[] args) {
        launch(args);

    }
}
