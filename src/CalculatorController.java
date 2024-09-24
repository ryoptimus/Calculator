import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import java.net.URL;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import java.util.ResourceBundle;

public class CalculatorController {
    @FXML private Pane titlePane;
    private double x, y;
    public void init(Stage stage) {
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getSceneX()-x);
            stage.setY(mouseEvent.getSceneY()-y);
        });
    }
}
