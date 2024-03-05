
package uspev.controllers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.h2.tools.RunScript;
import uspev.DBManager;
import static uspev.DBManager.getConnection;
import uspev.models.ModelCicldisciplin;


public class FXMLCicldisciplinController implements Initializable {
   public static Connection con=null;
    static Statement st=null;
    static ResultSet rs=null;
    
    @FXML
    private Button cklbtadd;
    @FXML
    private Button cklbtupdate;
    @FXML
    private Button cklbtdel;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            con=getConnection();
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLCicldisciplinController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

    ObservableList<ModelCicldisciplin> getCicllist() throws SQLException{
        ObservableList<ModelCicldisciplin> List=observableArrayList();
        st=con.createStatement();
        
        return List;
    }
    @FXML
    private void onAddCicle(ActionEvent event) {
              
        
        
    }

    @FXML
    private void onUpdateCicle(ActionEvent event) throws FileNotFoundException {
        
       
    }

    @FXML
    private void onDelCicle(ActionEvent event) {
    }
    
    
    
}
