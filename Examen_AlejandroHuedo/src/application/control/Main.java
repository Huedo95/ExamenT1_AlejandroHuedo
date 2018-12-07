package application.control;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/** 
 * @author Alex
 * @version 1.0
 * @see
 * 
 * 
 */
public class Main extends Application {
	Stage stage;
	FXMLLoader loader, loader2;
	Scene scene, scene2;

	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			loader = new FXMLLoader(getClass().getResource("Profile.fxml"));
			loader2 = new FXMLLoader(getClass().getResource("GetMe.fxml"));

			mainWindow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void mainWindow() throws Exception {
		AnchorPane pane1 = loader.load();
		scene = new Scene(pane1);
		stage.setScene(scene);	
		stage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
