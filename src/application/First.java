package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class First extends Application {
	@Override
	public void start(Stage stage) {
		try {
//			Group root1 = new Group(); just like the line below
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,700,400, Color.BLACK  );
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			
			Image icon = new Image("download (2).jpg"); //setting image
			stage.getIcons().add(icon); //passing image as icon
			stage.setTitle("Stage Demo Program w00t w00t"); //set title
//			stage.setWidth(500);
//			stage.setHeight(200);
//			stage.setResizable(false); //cant resize it
//			stage.setFullScreen(true);
			stage.setFullScreenExitHint("You can't exist unless you press q");
			stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
			
			
			stage.setScene(scene); //passing our scene to the stage
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}