package edu.sstu.practice.controllers;

import edu.sstu.practice.model.User;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class SecondPageController implements Initializable  {
    
    @FXML
    private Label test;
    @FXML
    private Label forDown;
    @FXML
    private Label normaCal;
    @FXML
    private Label forUp;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
    }
    
    public void addData(User user) {
        DecimalFormat df = new DecimalFormat("##.0");
        
        test.setText(test.getText() + " " + df.format(user.imb()));
        double temp = user.count();
        forDown.setText("Для похудение суточная норма калорий составляет: " + (int)(temp - temp * 0.2) + " ккал");
        normaCal.setText("Ваша суточная норма калорий составляет: " + (int)temp + " ккал");
        forUp.setText("Для набора массы суточная норма калорий составляет: " + (int)(temp + temp * 0.2) + " ккал");
    }
    
}
