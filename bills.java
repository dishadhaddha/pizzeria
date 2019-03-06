import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.collections.*;
import javafx.scene.paint.*;


public class bills extends Application
{
    // We keep track of the count, and label displaying the count:
        Label pname[]= new Label[14];
        Label iprice[]= new Label[14];
        Label qt[]= new Label[14];
        Label tprice[]= new Label[14];
        Label back[]= new Label[14];
        Label amt = new Label("");
        Label tax = new Label("");
        Label pay = new Label("");
        AnchorPane pane = new AnchorPane();
        Stage window;
    
    @Override
    public void start(Stage stage) throws Exception
    {
        
            }

    public void getOrder(String name[], int price[], int qty[], Stage stage)
    {
            double y1=97;
            double y2=125;
            double y3=87;
            int sum=0;
            double taxes=0.0;
            
            ScrollPane sp = new ScrollPane();
            sp.setLayoutX(0);
            sp.setLayoutY(0);
            sp.setPrefSize(414,750);
            sp.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
            sp.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
            sp.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
            
            pane.getStylesheets().add("bill.css");
            pane.setPrefWidth(420);
            
        for(int i=0; i<14; i++)
        {
            
            
            sum+=(price[i]*qty[i]);
            if(qty[i]!=0)
            {
                pname[i]=new Label(name[i]);
                iprice[i] = new Label(Integer.toString(price[i])+"/pc");
                qt[i] = new Label("Qty:"+Integer.toString(qty[i]));
                tprice[i] = new Label("Rs."+Integer.toString(price[i]*qty[i]));
                back[i]=new Label("");
                
                
                back[i].setLayoutX(8);
                back[i].setLayoutY(y3);
                back[i].setPrefHeight(70);
                back[i].setPrefWidth(395);      
                back[i].getStyleClass().add("back");
                
                pname[i].setLayoutX(30);
                pname[i].setLayoutY(y1);
                pname[i].getStyleClass().add("details");
                
                
                iprice[i].setLayoutX(288);
                iprice[i].setLayoutY(y1);
                iprice[i].getStyleClass().add("details");
                
                
                qt[i].setLayoutX(207);
                qt[i].setLayoutY(y1);
                qt[i].getStyleClass().add("details");
                
                
                tprice[i].setLayoutX(30);
                tprice[i].setLayoutY(y2);
                tprice[i].getStyleClass().add("total");
                
                
                
                
                y1+=80;
                y2+=80;
                y3+=80;
                
                
                pane.getChildren().addAll(back[i], pname[i], iprice[i], qt[i], tprice[i]);
            }
            
            
            
        }
        
        taxes=(sum*0.125);
        
        amt.setText("TOTAL AMOUNT: "+Integer.toString(sum));
        tax.setText("TAXES: "+Double.toString(taxes));
        pay.setText("PAYABLE AMOUNT: "+Double.toString(taxes+sum));
        
        amt.getStyleClass().add("amt");
        tax.getStyleClass().add("amt");
        pay.getStyleClass().add("pay");
        

        amt.setLayoutX(22);
        amt.setLayoutY(y1+5);
        
        tax.setLayoutX(260);
        tax.setLayoutY(y1+5);
        
        pay.setLayoutX(22);
        pay.setLayoutY(y2+10);
                
        
        Label tback = new Label("");
        tback.setLayoutX(8);
        tback.setLayoutY(y3);
        tback.setPrefHeight(90);
        tback.setPrefWidth(395);      
        tback.getStyleClass().add("tback");
        
        sp.getStylesheets().add("bill.css");
        pane.getStyleClass().add("root");
        
        
        pane.getChildren().addAll(tback, amt, pay,  tax);
        sp.setContent(pane);
        sp.setPrefWidth(414);
        sp.setFitToHeight(true);
        
        Scene scene = new Scene(sp, 414, 736);
        stage.setWidth(414);
        
        stage.setScene(scene);
        
        stage.show();
    }
}
