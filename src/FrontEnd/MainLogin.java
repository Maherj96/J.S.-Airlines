package FrontEnd;



import Service.User;
import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class MainLogin extends Application {

    Stage window;
    Scene scene1, scene2, Scene3;
   
    public static void main(String[] args) {
    	
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        //Button 1
        Label label1 = new Label("J.S. Airlines");
        Button button1 = new Button("Login");
        Button button2 =new Button("Not a member?");
        button1.setOnAction(e -> window.setScene(scene2));
        button2.setOnAction(e -> window.setScene(Scene3));

        //Layout 1 - children laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1,button2);
        scene1 = new Scene(layout1, 300, 300);


        window.setScene(scene1);
        window.setTitle("J.S. Airlines");
        window.show();
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
        //Defining the Name text field
        final TextField firstName = new TextField();
        firstName.setPromptText("Enter your first name.");
        firstName.setPrefColumnCount(10);
        firstName.getText();
        GridPane.setConstraints(firstName, 0, 0);
        grid.getChildren().add(firstName);
        //Defining the Last Name text field
        final TextField lastName = new TextField();
        lastName.setPromptText("Enter your last name.");
        GridPane.setConstraints(lastName, 0, 1);
        grid.getChildren().add(lastName);
        //Defining the Comment text field
        final TextField email = new TextField();
        email.setPrefColumnCount(15);
        email.setPromptText("Email address.");
        GridPane.setConstraints(email, 0, 2);
        grid.getChildren().add(email);
        final TextField password = new TextField();
        password.setPrefColumnCount(15);
        password.setPromptText("Email address.");
        GridPane.setConstraints(password, 0, 3);
        grid.getChildren().add(password);
        //Defining the Submit button
        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 1, 0);
        grid.getChildren().add(submit);
        //Defining the Clear button
        Button back = new Button("Back");
        GridPane.setConstraints(back, 1, 1);
        grid.getChildren().add(back);
        back.setOnAction(e -> window.setScene(scene1));
        Scene3 = new Scene(grid,300,300);
        
        
        
        
        	
        

    }
    }

