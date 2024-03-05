
package uspev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.annotation.Resource;


public  class DataInit {
    public static Connection con() {
    Connection conect=null;
        try {
            conect=DriverManager.getConnection("jdbc:h2:./datas/uspev;IFEXISTS=TRUE", "sa", "");
        } catch (SQLException ex) {
            Logger.getLogger(DataInit.class.getName()).log(Level.SEVERE, null, ex);
        }
    return conect;
}
    public static void addData() throws SQLException{
    Connection connection=con();
 
    Statement stm=connection.createStatement();
      
        
        ResultSet rs=stm.executeQuery("SELECT * FROM CICLDISCIPLIN");
        if (!rs.next()){
        String zapros="";
        zapros="INSERT INTO CICLDiSCIPLIN(name) VALUES('Математические')";
        stm.executeUpdate(zapros);
        zapros="INSERT INTO CICLDiSCIPLIN(name) VALUES('Естественнонаучные')";
        stm.executeUpdate(zapros);
        zapros="INSERT INTO CICLDiSCIPLIN(name) VALUES('Общепрофесиональные')";
        stm.executeUpdate(zapros);
        stm.close();
        connection.close();
} 
        else {   
    Alert a=new Alert(Alert.AlertType.CONFIRMATION);
    a.setTitle("Ошибка!");
    a.setContentText("База данных не пустая!");
    a.showAndWait();
    }
        }      
}


