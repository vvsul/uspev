
package uspev.controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static uspev.DataInit.con;


public class FXMLCikleditController implements Initializable {

    @FXML
    private Button savebt;
    @FXML
    private Button canselbt;
    @FXML
    private TextField cicltxt;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void onSave(ActionEvent event) throws SQLException {
     Stage st= (Stage) savebt.getScene().getWindow();
    if ( st.getTitle()=="Добавление цикла дисциплин"){
        String zapros="INSERT INTO CICLDISCIPLIN(NAME) VALUES(?) ";
       Connection connection=con(); 
       PreparedStatement prepare=connection.prepareStatement(zapros);
        prepare.setString(1, cicltxt.getText());
        prepare.execute();
        savebt.getScene().getWindow().hide();
    }
    else {
        String zapros="UPDATE CICLDISCIPLIN SET NAME=(?) WHERE ID=5";
       Connection connection=con(); 
       PreparedStatement prepare=connection.prepareStatement(zapros);
        prepare.setString(1, cicltxt.getText());
        prepare.execute();
        savebt.getScene().getWindow().hide();
    }
    }

    @FXML
    private void onCansel(ActionEvent event) {
        savebt.getScene().getWindow().hide();
    }
    
}
