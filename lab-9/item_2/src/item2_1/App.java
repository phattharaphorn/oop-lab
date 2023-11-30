package pro1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class App extends Application {

@Override // Override the start method in the Application class

public void start(Stage primaryStage) {

// Create a pane to hold the images views

GridPane pane = new GridPane();

// Place nodes in the pane

pane.add(new ImageView(new Image(getClass().getResourceAsStream("image/uk.gif"))), 0, 0);
pane.add(new ImageView(new Image(getClass().getResourceAsStream("image/ca.gif"))), 1, 0);
pane.add(new ImageView(new Image(getClass().getResourceAsStream("image/china.gif"))), 0, 1);
pane.add(new ImageView(new Image(getClass().getResourceAsStream("image/us.gif"))), 1, 1);

// Create a scene and place it in the stage

Scene scene = new Scene(pane);
primaryStage.setTitle("program1");
primaryStage.setScene(scene); 
primaryStage.show(); 
}
    public static void main(String[] args) {
        Application.launch(args);
    }
}
