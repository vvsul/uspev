
package uspev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;


public class DBManager {
    public static boolean openflag=false;
   static void InitBase(Connection con) throws SQLException{
       String zapros;
       Statement st=con.createStatement();
       zapros="CREATE TABLE PUBLIC.CICLDISCIPLIN (\n" +
"	ID INTEGER NOT NULL AUTO_INCREMENT,\n" +
        "	NAME VARCHAR_IGNORECASE(100),\n" +       
"	CONSTRAINT CICLDISCIPLIN_PK PRIMARY KEY (ID)\n" +
");";
       st.execute(zapros);
       zapros="CREATE TABLE PUBLIC.DISCIPLIN (\n" +
"	ID INTEGER NOT NULL AUTO_INCREMENT,\n" +
"	CICLID INTEGER,\n" +
"	NAME VARCHAR_IGNORECASE(100),\n" +
"	CONSTRAINT DISCIPLIN_PK PRIMARY KEY (ID)\n" +
");";
       st.execute(zapros);
       zapros="CREATE TABLE PUBLIC.GRUPPA (\n" +
"	ID INTEGER NOT NULL AUTO_INCREMENT,\n" +
"	OTDELENIEID INTEGER,\n" +
"	SPECIALNOSTID INTEGER,\n" +
"	KURS INTEGER,\n" +
"	NAME VARCHAR_IGNORECASE(20),\n" +
"	CONSTRAINT GRUPPA_PK PRIMARY KEY (ID)\n" +
");";
       st.execute(zapros);
       zapros="CREATE TABLE PUBLIC.OCENKI (\n" +
"	ID INTEGER NOT NULL AUTO_INCREMENT,\n" +
"	DISCIPLINAID INTEGER,\n" +
"	PREPODID INTEGER,\n" +
"	STUDENTID INTEGER,\n" +
"	OCENKA INTEGER,\n" +
"	\"DATA\" DATE,\n" +
"	CONSTRAINT OCENKI_PK PRIMARY KEY (ID)\n" +
");";
       st.execute(zapros);
       zapros="CREATE TABLE PUBLIC.OTDELENIE (\n" +
"	ID INTEGER NOT NULL AUTO_INCREMENT,\n" +
"	NAME VARCHAR_IGNORECASE,\n" +
"	CONSTRAINT OTDELENIE_PK PRIMARY KEY (ID)\n" +
");";
       st.execute(zapros);
       zapros="CREATE TABLE PUBLIC.PREPOD (\n" +
"	ID INTEGER NOT NULL AUTO_INCREMENT,\n" +
"	NAME VARCHAR_IGNORECASE,\n" +
"	CONSTRAINT PREPOD_PK PRIMARY KEY (ID)\n" +
");";
       st.execute(zapros);
       zapros="CREATE TABLE PUBLIC.SPECIALNOST (\n" +
"	ID INTEGER NOT NULL AUTO_INCREMENT,\n" +
"	NAME VARCHAR_IGNORECASE,\n" +
"	CONSTRAINT SPECIALNOST_PK PRIMARY KEY (ID)\n" +
");";
       st.execute(zapros);
       zapros="CREATE TABLE PUBLIC.STUDENT (\n" +
"	ID INTEGER NOT NULL AUTO_INCREMENT,\n" +
"	GRUPPAID INTEGER,\n" +
"	NAME VARCHAR_IGNORECASE,\n" +
"	CONSTRAINT STUDENT_PK PRIMARY KEY (ID)\n" +
");";
       st.execute(zapros);
       st.close();
       
   }    
   
 private static java.sql.Connection connection=null;
    public static Connection getConnection() throws SQLException{
       
try {
if (connection == null || connection.isClosed()) {
connection = DriverManager.getConnection("jdbc:h2:./datas/uspev;IFEXISTS=TRUE", "sa", "");
openflag=true;
}
} catch (SQLException exception) { 
    if (!openflag){
    Alert a=new Alert(AlertType.CONFIRMATION);
    a.setTitle("Ошибка!");
    a.setContentText("Файл базы данных отсутствует. Создать?");
   
    Optional<ButtonType> option= a.showAndWait();
    if (option.get()==ButtonType.OK){
       connection = DriverManager.getConnection("jdbc:h2:./datas/uspev", "sa", ""); 
       InitBase(connection);
    }
    }
    else {
        Alert a=new Alert(AlertType.WARNING);
    a.setTitle("Ошибка!");
    a.setContentText("Нет подключения к базе данных!");
    }

}
return connection;
}
    
}
