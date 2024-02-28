
package uspev.controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import uspev.DBManager;
import static uspev.DBManager.getConnection;


public class FXMLCicldisciplinController implements Initializable {

    public static void my() throws SQLException{
   getConnection();  
    }
    @FXML
    private Button cklbtadd;
    @FXML
    private Button cklbtupdate;
    @FXML
    private Button cklbtdel;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            my();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLCicldisciplinController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

    @FXML
    private void onAddCicle(ActionEvent event) {
    }

    @FXML
    private void onUpdateCicle(ActionEvent event) {
    }

    @FXML
    private void onDelCicle(ActionEvent event) {
    }
    
    
    
}
