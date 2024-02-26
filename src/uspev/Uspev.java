
package uspev;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Uspev extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Вход");
        btn.setOnAction((ActionEvent event) -> {
           FXMLLoader fxmlmainloader= new FXMLLoader();
           fxmlmainloader.setLocation(getClass().getResource("/uspev/views/FXMLmain.fxml"));
            try {
                fxmlmainloader.load();
            } catch (IOException ex) {
                Logger.getLogger(Uspev.class.getName()).log(Level.SEVERE, null, ex);
            }
            Parent root =fxmlmainloader.getRoot();
            Stage mainStage=new Stage();
            mainStage.setScene(new Scene(root));
            mainStage.setTitle("Успеваемость");
            mainStage.setResizable(false);
            mainStage.getIcons().add(new Image("/uspev/images/book.png"));
            primaryStage.getScene().getWindow().hide();
            mainStage.show();
          
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Авторизация");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
