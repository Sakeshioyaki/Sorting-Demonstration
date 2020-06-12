package application;

import java.io.IOException;

import element.Common;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller_wellcome {
    public void start_menu(ActionEvent event) throws IOException {
   	Parent root_well = FXMLLoader.load(getClass().getResource("ViewController.fxml"));
	//AnchorPane child = FXMLLoader.load(getClass().getResource("ViewController.fxml"));
    Scene begin =  new Scene(root_well,  Common.WINDOW_WIDTH, Common.WINDOW_HEIGHT);
    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    window.setTitle("Sorting Demonstration");
    window.setScene(begin);
    window.show();
    
   }
}
