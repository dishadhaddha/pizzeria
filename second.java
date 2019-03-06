
/**
 * Write a description of class fjlhd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class second extends Application
{
    Stage window;
    @Override
    public void start(Stage stage) throws Exception
    {
       
        window = stage;
        
        second s = new second();
        s.display(window);

        // Show the Stage (window)
        stage.show();
    }

    
    public void display(Stage window)
    {
        
        
        
        // Create a new anchor pane free form layout
        AnchorPane pane=new AnchorPane();
        
        
        //Create textfield for username
        TextField username=new TextField();
        username.setPromptText("Username");
        username.setLayoutX(57.56);
        username.setLayoutY(345);
        username.setPrefHeight(56.67);
        username.setPrefWidth(298.89);
        
        
        
        //Create textfield for emailid
        TextField emailid=new TextField();
        emailid.setPromptText("Email Id");
        emailid.setLayoutX(57.56);
        emailid.setLayoutY(415);
        emailid.setPrefHeight(56.67);
        emailid.setPrefWidth(298.89);
        
        TextField name=new TextField();
        name.setPromptText("Full Name");
        name.setLayoutX(57.56);
        name.setLayoutY(205);
        name.setPrefHeight(56.67);
        name.setPrefWidth(298.89);
        
        
        
        //Create textfield for emailid
        TextField dob=new TextField();
        dob.setPromptText("DoB");
        dob.setLayoutX(57.56);
        dob.setLayoutY(275);
        dob.setPrefHeight(56.67);
        dob.setPrefWidth(298.89);
        
        
        //Create password firld for password
        PasswordField password=new PasswordField();
        password.setPromptText("Password");
        password.setLayoutX(57.56);
        password.setLayoutY(485);
        password.setPrefHeight(56.67);
        password.setPrefWidth(298.89);
        
        
        //Create a button for signin
        Button signup = new Button("SIGN UP");
        signup.setLayoutX(119.78);
        signup.setLayoutY(574.74);
        signup.setPrefHeight(54.46);
        signup.setPrefWidth(169.01);
        signup.setMinHeight(18);
        signup.setOnAction(e->{
        menu m1 = new menu();
        m1.display(window);});
        
        
        //Create a button for sign up page
        Button sipage = new Button("");
        sipage.setLayoutX(69.78);
        sipage.setLayoutY(665);
        sipage.setPrefHeight(26.67);
        sipage.setPrefWidth(274.44);
        sipage.setMinHeight(18);
        sipage.setOnAction(e->{ first f = new first(); 
                                f.sidisplay(window);}       );
               
        
                    
        pane.getChildren().addAll(name, dob, username, emailid, password, signup, sipage);
        pane.getStylesheets().add("second.css");

        // JavaFX must have a Scene (window content) inside a Stage (window)
        window.setResizable(false);
        Scene scene = new Scene(pane, 414, 736);
        window.setTitle("Tasty Sign In");
        
        window.setScene(scene);
        
          
        
    }           
    
}

