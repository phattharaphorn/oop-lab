package pro3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

public class App extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a clock and a label
		ClockPane clock = new ClockPane((int)(Math.random() * 12), 
			((int)(Math.random() * 2) == 1 ? 30 : 0), 0);
		String timeString = clock.getHour() + ":" + clock.getMinute()
			+ ":" + clock.getSecond();
		clock.setSecondHandVisible(false); // Make second hand invisible
		Label time = new Label(timeString);

		// Place clock and label in border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(time);
		BorderPane.setAlignment(time, Pos.TOP_CENTER);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 250); 
		primaryStage.setTitle("program3"); 
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}

    public static void main(String[] args) {
        Application.launch(args);
    }
}
