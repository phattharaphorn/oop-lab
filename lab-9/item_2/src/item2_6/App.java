package pro6;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class App extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create three buttons
		Button btPause = new Button("Pause");
		Button btResume = new Button("Resume");
		Button btReverse = new Button("Reverse");

		// Create a hbox
		HBox paneForButtons = new HBox(5);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.getChildren().addAll(
			btPause, btResume, btReverse);

		FanPane fan = new FanPane();

		// Create a slider
		Slider slider = new Slider();
		slider.setMax(5);
		fan.rateProperty().bind(slider.valueProperty());

		// Create a pane
		BorderPane pane = new BorderPane();
		pane.setTop(paneForButtons);
		pane.setCenter(fan);
		pane.setBottom(slider);

		// Create and register handlers
		btPause.setOnAction(e -> {
			fan.pause();
		});

		btResume.setOnAction(e -> {
			fan.play();
		});

		btReverse.setOnAction(e -> {
			fan.reverse();
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("program6");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
	public static void main(String[] args) {
        Application.launch(args);
    }
}