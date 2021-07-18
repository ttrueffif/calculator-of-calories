package edu.sstu.practice.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StartPageController implements Initializable {
    
    // textfields
    @FXML
    private TextField ageField;
    @FXML
    private TextField heightField;
    @FXML
    private TextField weightField;
    
    //buttons
    @FXML
    private Button countButton;
    @FXML
    private Button clearButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
    }    
    
    public void submit(ActionEvent event) {
        
        try {
            int age = Integer.parseInt(ageField.getText());
            System.out.println(age);
        } catch (Exception e) {
            System.out.println("smth wrong");
        }
        
    }
    
    public void clearAll() {
        ageField.setText("");
        heightField.setText("");
        weightField.setText("");
    }
}
