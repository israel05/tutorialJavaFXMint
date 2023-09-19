
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxHelloWorld extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		StackPane raiz = new StackPane();
        stage.setTitle("hola");
        stage.setScene(new Scene(raiz, 800, 600));
        stage.show();
	}
}
