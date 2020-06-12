package application;

import element.Common;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("wellcome.fxml"));
        
        primaryStage.setTitle("Sorting Demonstration");
        primaryStage.setScene(new Scene(root, Common.WINDOW_WIDTH, Common.WINDOW_HEIGHT));
        primaryStage.setResizable(false);

        primaryStage.initStyle(StageStyle.TRANSPARENT);
    	//primaryStage.setTitle("helloworld");
    	


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
