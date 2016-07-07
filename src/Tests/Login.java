package Tests;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Aakif on 7/4/2016
 */
public class Login extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Login");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(15);
        grid.setPadding(new Insets(25,25,25,25));
        grid.setGridLinesVisible(false);

        Text sceneTitle = new Text("Login");
        grid.add(sceneTitle,0,0,2,1);
        sceneTitle.setId("title-text");

        Label userName = new Label("username:");
        grid.add(userName,0,1);

        TextField userNameField = new TextField();
        grid.add(userNameField,1,1);

        Label password = new Label("password:");
        grid.add(password,0,2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField,1,2);

        Button button = new Button("sign in");
        HBox buttonHbox = new HBox(10);
        buttonHbox.setAlignment(Pos.BOTTOM_RIGHT);
        buttonHbox.getChildren().add(button);
        grid.add(buttonHbox,1,4);

        final Text actionTarget = new Text();
        grid.add(actionTarget,1,6);
        actionTarget.setId("action-target");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actionTarget.setText("you pressed the button");
            }
        });

        Scene scene = new Scene(grid,350,289);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Login.class.getResource("Tests/Login.css").toExternalForm());
        primaryStage.show();
    }
}
