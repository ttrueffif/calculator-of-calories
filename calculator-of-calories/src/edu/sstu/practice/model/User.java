package edu.sstu.practice.model;

import javafx.scene.control.RadioButton;

public class User {
    
    private int age;
    private double height;
    private double weight;
    private RadioButton gender;
    private RadioButton formula;
    private String activity;
    
    public User(int age, double height, double weight,
            RadioButton gender, RadioButton formula, String activity) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.formula = formula;
        this.activity = activity;
    }
    
    public double count(){

        double result = 0.0;
        
        switch(formula.getId()) {
            case "mifflin" -> result = countByMifflin();
            case "benedikt" -> result = countByBenedikt();
        }
        
        return result;
        
    }
    
    public double countByMifflin() {
        
        double result = 0.0;
        
        switch (gender.getId()) {
            case "male" -> result = (10 * weight + 6.25 * height - 5 * age + 5) * Activity.ACTIVITIES.get(activity);
            case "female" -> result = (10 * weight + 6.25 * height - 5 * age - 161) * Activity.ACTIVITIES.get(activity);
        }
        
        return result;
    }
    
    
    public double countByBenedikt() {
        
        double result = 0.0;
        
        switch(gender.getId()) {
            case "male" -> {
                double bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
                result = bmr * Activity.ACTIVITIES.get(activity);
            }
            case "female" -> {
                double bmr2 = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
                result = bmr2 * Activity.ACTIVITIES.get(activity);
            }
        }
        
        return result;
        
    }
    
    public double imb() {
        return weight / Math.pow((height / 100), 2);
    }

    @Override
    public String toString() {
        return "User{" + "age=" + age + ", height=" + height + ", weight=" + weight + ", gender=" + gender + ", formula=" + formula + ", activity=" + activity + '}';
    }    
}
