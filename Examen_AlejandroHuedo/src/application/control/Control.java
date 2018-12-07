package application.control;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
/** 
 * @author Alex
 * @version 1.0
 * @see
 * 
 * 
 */
public class Control {
	
	Stage stage;
	Scene scene;
	Stage stage1;
	Scene scene1;
	
	@FXML
	ImageView Menu;
	@FXML
	AnchorPane AnchorPane;
	@FXML
	Pane pane1;
	@FXML
	JFXButton pulsador;
	@FXML
	Button boton;
	
	/*public void abrir(){
		try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("GetMe.fxml"));
		AnchorPane ventanaDos = (AnchorPane) loader.load();
		stage = new Stage();
		Scene scene = new Scene(ventanaDos);
		stage.setTitle("GET ME");
		stage.setScene(scene);
		stage.show();
		Stage thisStage= (Stage) pulsador.getScene().getWindow();
		thisStage.close();
		 
		} catch (IOException e) {
		e.printStackTrace();
		}
		}*/
	public void abrir() {
		try {

            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("GetMe.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("GetMe");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);
            
            sendStage.show();

			// clips

			// );
			//
			// ColorAdjust colorAdjust = new ColorAdjust();
			// colorAdjust.setContrast(1);
			// colorAdjust.setHue(0);
			// colorAdjust.setBrightness(0);
			// colorAdjust.setSaturation(0);
			// // ceiling_image.setEffect(colorAdjust);
			// ceiling_image.setEffect(new GaussianBlur(5));
			// refugees.setClip(ceiling);

			
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void closeStage() throws Exception {
		Stage thisStage = (Stage) boton.getScene().getWindow();
	    thisStage.close();	
	}
	
	public void initialize() {
		TranslateTransition translateTransition = new TranslateTransition(
				Duration.seconds(0.5), Menu);
		translateTransition.play();
		translateTransition
				.setOnFinished(event -> {
					TranslateTransition translateTransition1 = new TranslateTransition(
							Duration.seconds(1), Menu);					
					translateTransition1.play();
				});

	}
}
