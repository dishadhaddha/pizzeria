import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.collections.*;
import javafx.scene.paint.*;
import javafx.animation.PauseTransition;
import javafx.util.Duration;
import javafx.geometry.Pos;

public class menu extends Application
{
    Stage window;
    Stage alert;

    int c=0;
    String name[]={"VEGGIE SUPREME","EXOTICA","PANEER VEGORAMA","TANDOORI PANEER","VEGGIE LOVER","COUNTRY FEAST","DOUBLE CHEESE","VEGGIE FEAST","PANEER OVERLOADED","VEGGIE OVERLOADED"
        , "SPICE OVERLOADED","PANEER CORN","PANEER MAKHANI","VEGGIE PARADISE","VEG. EXTRAVAGANZA","MEXICAN GREEN WAVE"};
    String toppings[]={"Onion, Capsicum, Mushroom, Red Paprika" ,"Red Capsicum, Green Capsicum, Baby Corn" ,"Paneer, Onion, Capsicum, Black Olives" ,"Paneer, Onion, Capsicum, Red Paprika"
        ,"Capsicum, Mushroom, Tomato, Red Paprika","Onion, Capsicum, Mushroom, Sweet Corn", "Extra Cheese On Cheese", "Capsicum, Onion, Sweet Corn"
        ,"Paneer, Onion, Tomato, Corn","Onion, Corn, Jalapeno, Black Olive","Onion, Capsicum, Paprika, Jalapeno","Paneer, Corn, Olives, Cheese"
        ,"Onions, Capsicum, Paneer, Makhani Sauce","Corn, Olives, Capsicum, Red Paprika","Olives, Onions, Mushrooms, Tomatoes","Olives, Corn, Paprika, Cheese"};
    int price[]={490, 490, 490, 490, 460, 460, 370, 370, 370, 270, 270, 290, 300, 275, 450,380};
    int qty[]=new int[14];
    Label qt[] = new Label[16];

    Button incr[]=new Button[16];
    Button dcr[]=new Button[16];
    Button cl[]=new Button[16];

    @Override
    public void start(Stage stage) throws Exception
    {
        window=stage;

        menu m= new menu();
        m.display(window);
        

        // Show the Stage (window)
        stage.show();
    }

    public void display(Stage window)
    {
        // Create a new anchor pane free form layout
        AnchorPane pane=new AnchorPane();
        pane.setPrefSize(414,736);

        ScrollPane sp = new ScrollPane();
        sp.setLayoutX(0);
        sp.setLayoutY(0);
        sp.setPrefSize(430,750);
        sp.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        sp.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        sp.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        pane.getStylesheets().add("same.css");
        pane.getStyleClass().add("root");

        

        Label p[] = new Label[16];
        Label pt[] = new Label[16];
        Label pr[] = new Label[16];

        double y=105.5;
        double yt=140.83;
        double ypr=178.45;
        double yqt=182;
        for(int i=0; i<14; i++) 
        {
            p[i]=new Label(name[i]);
            p[i].setLayoutX(142.7);
            p[i].setLayoutY(y);
            y+=150;
            p[i].getStyleClass().add("headings");

            pt[i]=new Label(toppings[i]);
            pt[i].setLayoutX(142.7);
            pt[i].setLayoutY(yt);
            yt+=150;
            pt[i].getStyleClass().add("toppings");

            pr[i]=new Label("Rs."+Integer.toString(price[i]));
            pr[i].setLayoutX(148.35);
            pr[i].setLayoutY(ypr);
            ypr+=150;
            pr[i].getStyleClass().add("price");

            qt[i]=new Label(Integer.toString(qty[i]));
            qt[i].setLayoutX(312);
            qt[i].setLayoutY(yqt);
            yqt+=150;
            qt[i].getStyleClass().add("qty");

            pane.getChildren().addAll(p[i], pt[i], pr[i], qt[i]);
        }
        
        
        double ybt=175;
        double ycbt=178;
        for(int i=0; i<14; i++)
        {
            incr[i]=new Button("+");
            dcr[i]= new Button("-");
            cl[i]= new Button("");
            incr[i].setLayoutX(270);
            incr[i].setLayoutY(ybt);
            dcr[i].setLayoutX(330);
            dcr[i].setLayoutY(ybt);
            cl[i].setLayoutX(358);
            cl[i].setLayoutY(ycbt);
            cl[i].setPrefHeight(32);
            cl[i].setPrefWidth(32);
            ybt+=150;
            ycbt+=150;

            incr[i].getStyleClass().add("button-change");
            dcr[i].getStyleClass().add("button-change");
            cl[i].getStyleClass().add("button");

            pane.getChildren().addAll(incr[i], dcr[i], cl[i]);
        }

        menu t = new menu();
        incr[0].setOnAction(e->{  qt[0].setText(Integer.toString(++t.qty[0]));});
        incr[1].setOnAction(e->{   qt[1].setText(Integer.toString(++t.qty[1]));});
        incr[2].setOnAction(e->{  qt[2].setText(Integer.toString(++t.qty[2]));});
        incr[3].setOnAction(e->{  qt[3].setText(Integer.toString(++t.qty[3]));});
        incr[4].setOnAction(e->{   qt[4].setText(Integer.toString(++t.qty[4]));});
        incr[5].setOnAction(e->{   qt[5].setText(Integer.toString(++t.qty[5]));});
        incr[6].setOnAction(e->{   qt[6].setText(Integer.toString(++t.qty[6]));});
        incr[7].setOnAction(e->{   qt[7].setText(Integer.toString(++t.qty[7]));});
        incr[8].setOnAction(e->{  qt[8].setText(Integer.toString(++t.qty[8]));});
        incr[9].setOnAction(e->{  qt[9].setText(Integer.toString(++t.qty[9]));});
        incr[10].setOnAction(e->{ qt[10].setText(Integer.toString(++t.qty[10]));});
        incr[11].setOnAction(e->{   qt[11].setText(Integer.toString(++t.qty[11]));});
        incr[12].setOnAction(e->{  qt[12].setText(Integer.toString(++t.qty[12]));});
        incr[13].setOnAction(e->{  qt[13].setText(Integer.toString(++t.qty[13]));});

        input neg = new input();
        String inpAlert="Input Error";
        String negMsg="Number of pizzas can't be negative";

        dcr[0].setOnAction(e->{  
                --t.qty[0];
                if(t.qty[0]<=-1)
                { neg.display(inpAlert, negMsg); 
                    t.qty[0]=0;}
                qt[0].setText(Integer.toString(t.qty[0]));
            });
        dcr[1].setOnAction(e->{  
                --t.qty[1];
                if(t.qty[1]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[1]=0;}
                qt[1].setText(Integer.toString(t.qty[1]));
            });
        dcr[2].setOnAction(e->{  
                --t.qty[2];
                if(t.qty[2]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[2]=0;}
                qt[2].setText(Integer.toString(t.qty[2]));
            });
        dcr[3].setOnAction(e->{  
                --t.qty[3];
                if(t.qty[3]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[3]=0;}
                qt[3].setText(Integer.toString(t.qty[3]));
            });
        dcr[4].setOnAction(e->{  
                --t.qty[4];
                if(t.qty[4]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[4]=0;}
                qt[4].setText(Integer.toString(t.qty[4]));
            });
        dcr[5].setOnAction(e->{  
                --t.qty[5];
                if(t.qty[5]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[5]=0;}
                qt[5].setText(Integer.toString(t.qty[5]));
            });
        dcr[6].setOnAction(e->{  
                --t.qty[6];
                if(t.qty[6]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[6]=0;}
                qt[6].setText(Integer.toString(t.qty[6]));
            });
        dcr[7].setOnAction(e->{  
                --t.qty[7];
                if(t.qty[7]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[7]=0;}
                qt[7].setText(Integer.toString(t.qty[7]));
            });
        dcr[8].setOnAction(e->{  
                --t.qty[8];
                if(t.qty[8]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[8]=0;}
                qt[8].setText(Integer.toString(t.qty[8]));
            });
        dcr[9].setOnAction(e->{  
                --t.qty[9];
                if(t.qty[9]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[9]=0;}
                qt[9].setText(Integer.toString(t.qty[9]));
            });
        dcr[10].setOnAction(e->{  
                --t.qty[10];
                if(t.qty[10]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[10]=0;}
                qt[10].setText(Integer.toString(t.qty[10]));
            });
        dcr[11].setOnAction(e->{  
                --t.qty[11];
                if(t.qty[11]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[11]=0;}
                qt[11].setText(Integer.toString(t.qty[11]));
            });
        dcr[12].setOnAction(e->{  
                --t.qty[12];
                if(t.qty[12]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[12]=0;}
                qt[12].setText(Integer.toString(t.qty[12]));
            });
        dcr[13].setOnAction(e->{  
                --t.qty[13];
                if(t.qty[13]<0)
                { neg.display(inpAlert, negMsg); 
                    t.qty[13]=0;}
                qt[13].setText(Integer.toString(t.qty[13]));
            });

        cl[0].setOnAction(e->{  t.qty[0]=0;              qt[0].setText(Integer.toString(t.qty[0]));});
        cl[1].setOnAction(e->{  t.qty[1]=0;              qt[1].setText(Integer.toString(t.qty[1]));});
        cl[2].setOnAction(e->{  t.qty[2]=0;              qt[2].setText(Integer.toString(t.qty[2]));});
        cl[3].setOnAction(e->{  t.qty[3]=0;              qt[3].setText(Integer.toString(t.qty[3]));});
        cl[4].setOnAction(e->{  t.qty[4]=0;              qt[4].setText(Integer.toString(t.qty[4]));});
        cl[5].setOnAction(e->{  t.qty[5]=0;              qt[5].setText(Integer.toString(t.qty[5]));});
        cl[6].setOnAction(e->{  t.qty[6]=0;              qt[6].setText(Integer.toString(t.qty[6]));});
        cl[7].setOnAction(e->{  t.qty[7]=0;              qt[7].setText(Integer.toString(t.qty[7]));});
        cl[8].setOnAction(e->{  t.qty[8]=0;              qt[8].setText(Integer.toString(t.qty[8]));});
        cl[9].setOnAction(e->{  t.qty[9]=0;              qt[9].setText(Integer.toString(t.qty[9]));});
        cl[10].setOnAction(e->{  t.qty[10]=0;              qt[10].setText(Integer.toString(t.qty[10]));});
        cl[11].setOnAction(e->{  t.qty[11]=0;              qt[11].setText(Integer.toString(t.qty[11]));});
        cl[12].setOnAction(e->{  t.qty[12]=0;              qt[12].setText(Integer.toString(t.qty[12]));});
        cl[13].setOnAction(e->{  t.qty[13]=0;              qt[13].setText(Integer.toString(t.qty[13]));});

        Label scroll = new Label("Scroll down for more options & order confirmation");
        scroll.setLayoutX(16);
        scroll.setLayoutY(600);
        scroll.setPrefHeight(40);
        scroll.setPrefWidth(380);
        scroll.getStyleClass().add("temp");
        scroll.setAlignment(Pos.CENTER);

        PauseTransition visiblePause = new PauseTransition(Duration.seconds(4));
        visiblePause.setOnFinished(
            event -> scroll.setVisible(false)
        );
        visiblePause.play();

                
        //title button BILLING
        Button billingpg= new Button("");
        billingpg.setLayoutX(111.57);
        billingpg.setLayoutY(2210);
        billingpg.setPrefHeight(34.61);
        billingpg.setPrefWidth(190.85);
        billingpg.setPadding(new Insets(0, 0, 0, 0));    
        billingpg.setOnAction(e->
            {   
                bills ob = new bills();
                ob.getOrder(name, price, t.qty, window);

            });

        Label setfit = new Label("");
        setfit.setLayoutY(2230);
        setfit.setPrefHeight(10);

      

        pane.getChildren().addAll( billingpg, setfit, scroll);
        sp.setContent(pane);
        sp.setFitToHeight(true);


        Scene scene = new Scene(sp, 414, 736);
        window.setResizable(false);
        window.setWidth(414);
        window.setHeight(736);

        window.setTitle("Tasty MENU");
        window.setScene(scene);
    }

}
