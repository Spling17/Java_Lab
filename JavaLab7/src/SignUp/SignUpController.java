package SignUp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpController implements Initializable{

    SignUpModel signUpModel = new SignUpModel();

    @FXML
    private Label dbStatus;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private PasswordField passwordConfirm;
    @FXML
    private Button SignUpBtn;
    @FXML
    private Label SignUpStatus;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        if(signUpModel.isDatabaseConnected()){
            //inject a text to dbStatus that db is connected
            this.dbStatus.setText("Connected");
        }else{
            this.dbStatus.setText("Not Connected");
        }
        
    }

    @FXML
    public void SignUp(ActionEvent event){


        if(this.password.getText().equals(this.passwordConfirm.getText()) ){

            signUpModel.isSignUp(this.username.getText(), this.password.getText());
            Stage stage = (Stage) this.SignUpBtn.getScene().getWindow();
            stage.close();
            
            LoginPage();
        }else{
            this.SignUpStatus.setText("Error!! Not mach");
        }
    }

    //Register a new user

    public void LoginPage(){

        Stage homeStage = new Stage();
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/login/Login.fxml")));

            homeStage.setScene(scene);
            homeStage.setTitle("Login Page");
            homeStage.setResizable(false);
            homeStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}