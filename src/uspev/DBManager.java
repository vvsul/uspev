
package uspev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class DBManager {
 private static java.sql.Connection connection=null;
    public static Connection getConnection() throws SQLException{
       
try {
if (connection == null || connection.isClosed()) {
connection = DriverManager.getConnection("jdbc:h2:./src/uspev/uspev.mv.db", "sa", "");
Alert a=new Alert(AlertType.INFORMATION);
    a.setTitle("Успешно");
    a.show();
}
} catch (SQLException exception) { 
    Alert a=new Alert(AlertType.ERROR);
    a.setTitle("Ошибка");
    a.showAndWait();

}
return connection;
}
    
}
