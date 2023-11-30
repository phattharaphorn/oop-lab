package pro4;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

public class App extends Application {
	@Override // Override the start method on the Application class
	public void start(Stage primaryStage) {
		// Create a car
		CarPane pane = new CarPane();

		// Create and register handles
		pane.setOnMousePressed(e -> pane.pause());
		pane.setOnMouseReleased(e -> pane.play());

		pane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.UP) {
				pane.increaseSpeed();
			}
			else if (e.getCode() == KeyCode.DOWN) {
				pane.decreaseSpeed();
			}
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 600, 100);
		primaryStage.setTitle("program4"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 

		pane.requestFocus();
	}

public static void main(String[] args) {
    Application.launch(args);
}
}
