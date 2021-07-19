package edu.sstu.practice.model;

import java.util.HashMap;
import java.util.Map;


public final class Activity {
    
    public static Map<String, Double> ACTIVITIES = new HashMap<String, Double>();
    
    static
    {
        ACTIVITIES.put("Минимальная активность", 1.2);
        ACTIVITIES.put("Слабая активность", 1.375);
        ACTIVITIES.put("Средняя активность", 1.55);
        ACTIVITIES.put("Высокая активность", 1.725);
        ACTIVITIES.put("Экстра-активность", 1.9);
        
    }

    private Activity() {}
}
