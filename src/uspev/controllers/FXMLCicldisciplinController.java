
package uspev.controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
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
    @FXML
    private static TableView<ModelCicldisciplin> cicltable;
    @FXML
    private TableColumn<ModelCicldisciplin, Integer> ciclnomer;
    @FXML
    private TableColumn<ModelCicldisciplin, String> ciclname;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ciclshow();
    }   
    public void ciclshow(){
        try {
            ciclnomer.setCellValueFactory(new PropertyValueFactory("id"));
            ciclname.setCellValueFactory(new PropertyValueFactory("name"));
            con=getConnection();
           ObservableList<ModelCicldisciplin> list=getCicllist();
           cicltable.setItems(list);
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLCicldisciplinController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    ObservableList<ModelCicldisciplin> getCicllist() throws SQLException{
        ObservableList<ModelCicldisciplin> List=observableArrayList();
        st=con.createStatement();
        String zapros="SELECT * FROM CICLDISCIPLIN";
        rs=st.executeQuery(zapros);
        while (rs.next())
        {
            List.add(new ModelCicldisciplin(rs.getInt("ID"),rs.getString("NAME")));
        }
        return List;
    }
    
   void ciclEditShow(String title) throws IOException{
       FXMLLoader loader=new FXMLLoader();
       loader.setLocation(getClass().getResource("/uspev/views/FXMLCikledit.fxml"));
       loader.load();
       Stage stage=new Stage();
       Parent root =loader.getRoot();
       stage.setScene(new Scene(root));
       stage.setTitle(title);
       stage.showAndWait();
       ciclshow();
             
   }
   
   public static int getID(){
       TablePosition pos = cicltable.getSelectionModel().getSelectedCells().get(0);
        int row = pos.getRow();
        ModelCicldisciplin item=cicltable.getItems().get(row);
        TableColumn col = pos.getTableColumn();
        String data = (String) col.getCellObservableValue(item).getValue();
        System.out.println(data);
    return 0;
}
    
    @FXML
    private void onAddCicle(ActionEvent event) throws SQLException, IOException {
              
        ciclEditShow("Добавление цикла дисциплин");
        
    }

    @FXML
    private void onUpdateCicle(ActionEvent event) throws FileNotFoundException, SQLException, IOException {
        
        ciclEditShow("Редактирование цикла дисциплин");
    }

    @FXML
    private void onDelCicle(ActionEvent event) {
       getID(); 
    }
    
    
    
}
