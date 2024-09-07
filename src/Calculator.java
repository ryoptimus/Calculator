import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
public class Calculator extends Application {
    @Override
    public void start(Stage stage) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindowInterface.fxml"));
        stage.show();
    }

    public void run() {
        launch();
    }
}
