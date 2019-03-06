

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.beans.property.*;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.*;

public class first extends Application
{
    Stage window;
    @Override
    public void start(Stage stage) throws Exception
    {
        //making window and stage same foe global access
        window=stage;

        first f = new first();
        f.sidisplay(window);
        
        // Show the Stage (window)
        stage.show();
    }
    
    
    
    public void sidisplay(Stage window)
    {
        
        // Create a new anchor pane free form layout
        AnchorPane pane=new AnchorPane();
        
        /*CHECk HERE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
        //window.initStyle(StageStyle.UNDECORATED); 
        
        
        //Create textfield for username
        TextField username=new TextField();
        username.setPromptText("Username");
        username.setLayoutX(65.1);
        username.setLayoutY(330);
        username.setPrefHeight(56.67);
        username.setPrefWidth(298.89);
        
        
        //Create password firld for password
        PasswordField password=new PasswordField();
        password.setPromptText("Password");
        password.setLayoutX(65.1);
        password.setLayoutY(405);
        password.setPrefHeight(56.67);
        password.setPrefWidth(298.89);
        
        
        //Create a button for signin
        Button signin = new Button("SIGN IN");
        signin.setLayoutX(116.52);
        signin.setLayoutY(527.71);
        signin.setPrefHeight(62.22);
        signin.setPrefWidth(191.86);
        signin.setOnAction(e->{
        menu m1 = new menu();
        m1.display(window);});
        
        
        //Create a button for sign up page
        Button supage = new Button("");
        supage.setLayoutX(80.82);
        supage.setLayoutY(652.72);
        supage.setPrefHeight(26.67);
        supage.setPrefWidth(274.44);
        supage.setOnAction(e->{
        second s = new second();
        s.display(window);});
        
       
       
        
        pane.getChildren().addAll(username, password, signin, supage);
        pane.getStylesheets().add("first.css");

        // JavaFX must have a Scene (window content) inside a Stage (window)
        window.setResizable(false);
        Scene scene = new Scene(pane, 414, 736);
        pane.setPrefWidth(414);
        pane.setPrefHeight(736);
        
    
        window.setTitle("Tasty Sign In");
        window.setScene(scene);
        
        
        
        
        
    }
    

}