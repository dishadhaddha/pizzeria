

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class input extends Application
{
    // We keep track of the count, and label displaying the count:
    Stage window;
    @Override
    public void start(Stage stage) throws Exception
    {
    }
        public static void display(String title, String message) {
        Stage window = new Stage();

        //Block events to other windows
       

        Label label = new Label();
        label.setLayoutX(23.27);
        label.setLayoutY(20.3);
        label.setText(message);
        
        
        Button closeButton = new Button("OK");
        closeButton.setOnAction(e -> window.close());
        closeButton.setLayoutX(100);
        closeButton.setLayoutY(55);
        

        AnchorPane layout = new AnchorPane();
        layout.getChildren().addAll(label, closeButton);
        layout.getStylesheets().add("input.css");

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout, 250, 100);
        window.setTitle(title);
        window.setScene(scene);
        window.showAndWait();
        
    }

    }

    
