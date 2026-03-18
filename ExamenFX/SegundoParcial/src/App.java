import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage arg0){
        arg0.setTitle("Hola");
        VBox neva = new VBox();
        Label uo = new Label("HOLA");
        Scene eScene = new Scene(uo, 400, 300);
        arg0.setScene(eScene);
        

        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
