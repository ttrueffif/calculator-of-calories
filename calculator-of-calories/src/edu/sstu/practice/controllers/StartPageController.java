package edu.sstu.practice.controllers;

import edu.sstu.practice.model.Activity;
import edu.sstu.practice.model.User;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class StartPageController implements Initializable {
    
    @FXML
    private ChoiceBox<String> activitiesBox;
    
    // textfields
    @FXML
    private TextField ageField;
    @FXML
    private TextField heightField;
    @FXML
    private TextField weightField;
    
    //labels
    @FXML
    private Label errorMessage;
    @FXML
    private Label warning;
    
    //toggleGroups
    @FXML
    private ToggleGroup gender;
    @FXML
    private ToggleGroup formula;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {  
        Set<String> temp = Activity.ACTIVITIES.keySet();
        activitiesBox.getItems().addAll(temp);
    }

    public void submit(ActionEvent event) {
        
        int age = 0;
        double weight = 0.0, height = 0.0;
        
        try {
            age = Integer.parseInt(ageField.getText());
            height = Double.parseDouble(heightField.getText());
            weight = Double.parseDouble(weightField.getText());
            
            if (age < 0 || height < 0 || weight < 0) {
                throw new RuntimeException("Отрицательные значения?");
            }
            errorMessage.setText("");
            
            if (activitiesBox.getValue() == null) {
                warning.setText("Выберите элемент из списка!");
                return;
            }
            warning.setText("");
            
        } catch (Exception e) {
            errorMessage.setText("Проверьте форму!");
            
            if (activitiesBox.getValue() == null) {
                warning.setText("Выберите элемент из списка!");
                return;
            }
            warning.setText("");
            
            return;
        }
        
        User user = new User(age, height, weight, (RadioButton)gender.getSelectedToggle(), 
            (RadioButton)formula.getSelectedToggle(), activitiesBox.getValue());
        double result = user.count();
        
        System.out.println(result);           
    }
     
    public void clearAll() {
        ageField.clear();
        heightField.clear();
        weightField.clear();
        gender.selectToggle(gender.getToggles().get(0));
        formula.selectToggle(formula.getToggles().get(0));
        activitiesBox.setValue(null);
        errorMessage.setText("");
        warning.setText("");
    }
}
