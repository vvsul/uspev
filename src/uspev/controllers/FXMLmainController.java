
package uspev.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class FXMLmainController implements Initializable {

    @FXML
    private MenuItem closd;
    @FXML
    private MenuBar mnpane;
    @FXML
    private MenuItem ciclid;
    @FXML
    private MenuItem dscliplinid;
    @FXML
    private MenuItem otdelenieid;
    @FXML
    private MenuItem gruppaid;
    @FXML
    private MenuItem prepodid;
    @FXML
    private MenuItem studentid;
    @FXML
    private MenuItem ocenkiid;
    @FXML
    private MenuItem specialnostid;
    @FXML
    private MenuItem aboutid;

   
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
      
        Stage stage=(Stage)mnpane.getScene().getWindow();
        stage.hide();
        ciclstage.showAndWait();
        
        stage.show();
    }

    @FXML
    private void onDisciplin(ActionEvent event) {
        FXMLLoader disciplinloader=new FXMLLoader();
        disciplinloader.setLocation(getClass().getResource("/uspev/views/FXMLDisciplin.fxml"));
        try {
            disciplinloader.load();
        } catch (IOException ex) {
            Logger.getLogger(FXMLmainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Parent root=disciplinloader.getRoot();
        Stage disciplinstage=new Stage();
        disciplinstage.setScene(new Scene(root));
        disciplinstage.setTitle("Дисциплины");
        Stage stage=(Stage)mnpane.getScene().getWindow();
        stage.hide();
        disciplinstage.showAndWait();
        stage.show();
        
    }

    @FXML
    private void onOtdelenie(ActionEvent event) {
        FXMLLoader otdelenieloader=new FXMLLoader();
        otdelenieloader.setLocation(getClass().getResource("/uspev/views/FXMLOtdelenie.fxml"));
        try {
            otdelenieloader.load();
        } catch (IOException ex) {
            Logger.getLogger(FXMLmainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Parent root=otdelenieloader.getRoot();
        Stage otdeleniestage=new Stage();
        otdeleniestage.setScene(new Scene(root));
        otdeleniestage.setTitle("Отделения");
        Stage stage=(Stage)mnpane.getScene().getWindow();
        stage.hide();
        otdeleniestage.showAndWait();
        stage.show();       
        
    }

    @FXML
    private void onGruppa(ActionEvent event) {
        FXMLLoader grupploader=new FXMLLoader();
        grupploader.setLocation(getClass().getResource("/uspev/views/FXMLgruppa.fxml"));
        try {
            grupploader.load();
        } catch (IOException ex) {
            Logger.getLogger(FXMLmainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Parent root=grupploader.getRoot();
        Stage gruppstage=new Stage();
        gruppstage.setTitle("Группа");
        gruppstage.setScene(new Scene(root));
        Stage stage=(Stage)mnpane.getScene().getWindow();
        stage.hide();
        gruppstage.showAndWait();
        stage.show();
        
    }

    @FXML
    private void onPrepod(ActionEvent event) {
        FXMLLoader prepodloader=new FXMLLoader();
        prepodloader.setLocation(getClass().getResource("/uspev/views/FXMLPrepod.fxml"));
        try {
            prepodloader.load();
        } catch (IOException ex) {
            Logger.getLogger(FXMLmainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Parent root=prepodloader.getRoot();
        Stage prepodstage=new Stage();
        prepodstage.setScene(new Scene(root));
        prepodstage.setTitle("Преподаватели");
        Stage stage=(Stage)mnpane.getScene().getWindow();
        stage.hide();
        prepodstage.showAndWait();
        stage.show();
                
    }

    @FXML
    private void onStudent(ActionEvent event) {
        FXMLLoader studentloader=new FXMLLoader();
        studentloader.setLocation(getClass().getResource("/uspev/views/FXMLStudent.fxml"));
        try {
            studentloader.load();
        } catch (IOException ex) {
            Logger.getLogger(FXMLmainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Parent root=studentloader.getRoot();
        Stage studentstage=new Stage();
      studentstage.setScene(new Scene(root));
        studentstage.setTitle("Студенты");
        Stage stage=(Stage)mnpane.getScene().getWindow();
        stage.hide();
        studentstage.showAndWait();
        stage.show();
        
    }

    @FXML
    private void onOcenki(ActionEvent event) {
        FXMLLoader ocenkiloader=new FXMLLoader();
        ocenkiloader.setLocation(getClass().getResource("/uspev/views/FXMLOcenki.fxml"));
        try {
            ocenkiloader.load();
        } catch (IOException ex) {
            Logger.getLogger(FXMLmainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Parent root=ocenkiloader.getRoot();
        Stage ocenkistage=new Stage();
        Scene scene=new Scene(root);
        scene.getStylesheets().add("/uspev/views/fxmlmain.css");
        ocenkistage.setScene(scene);
        ocenkistage.setTitle("Успеваемость");
        Stage stage=(Stage)mnpane.getScene().getWindow();
        stage.hide();
        ocenkistage.showAndWait();
        stage.show();
        
    }

    @FXML
    private void onSpecialnost(ActionEvent event) {
        
        FXMLLoader specialnostloader =new FXMLLoader();
        specialnostloader.setLocation(getClass().getResource("/uspev/views/FXMLSpecialnost.fxml"));
        try {
            specialnostloader.load();
        } catch (IOException ex) {
            Logger.getLogger(FXMLmainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Parent specroot =specialnostloader.getRoot();
        Stage specialnoststage=new Stage();
        specialnoststage.setScene(new Scene(specroot));
        specialnoststage.setTitle("Специальности");
        Stage stage=(Stage)mnpane.getScene().getWindow();
        stage.hide();
        specialnoststage.showAndWait();
        stage.show();
    }

    @FXML
    private void onAbout(ActionEvent event) {
        FXMLLoader aboutloader =new FXMLLoader();
        aboutloader.setLocation(getClass().getResource("/uspev/views/FXMLHelp.fxml"));
        try {
            aboutloader.load();
        } catch (IOException ex) {
            Logger.getLogger(FXMLmainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Parent specroot =aboutloader.getRoot();
        Stage aboutstage=new Stage();
        aboutstage.setScene(new Scene(specroot));
        aboutstage.setTitle("Специальности");
        Stage stage=(Stage)mnpane.getScene().getWindow();
        stage.hide();
        aboutstage.showAndWait();
        stage.show();
    }
  
    
}
