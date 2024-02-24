
package uspev.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;


public class FXMLmainController implements Initializable {

    @FXML
    private MenuItem closd;
    @FXML
    private MenuBar mnpane;
    @FXML
    private MenuItem ciclid;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClose(ActionEvent event) {
        Stage stage=(Stage)mnpane.getScene().getWindow();
        stage.close();
        
    }

    @FXML
    private void onCicl(ActionEvent event) {
        FXMLLoader ciclloader=new FXMLLoader();
        ciclloader.setLocation(getClass().getResource("/uspev/views/FXMLCicldisciplin.fxml"));
        try {
            ciclloader.load();
        } catch (IOException ex) {
            Logger.getLogger(FXMLmainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Parent root =ciclloader.getRoot();
        Stage ciclstage=new Stage();
        ciclstage.setScene(new Scene(root));
        ciclstage.setTitle("Цикл дисциплин");
        ciclstage.show();
        
    }
    
}
