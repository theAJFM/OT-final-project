/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Febryan Margali & Zunio Benarrivo
 */
//This is a class that binds the controller, the model, and the view into one entity.
public class FinalProject extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));//Combining the view with the controller
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        scene.getStylesheets().add("finalproject/stylesheet.css");//Add stylesheet to edit the user interface of the program.
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
