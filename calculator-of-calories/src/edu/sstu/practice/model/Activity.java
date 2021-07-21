package edu.sstu.practice.model;

import java.util.HashMap;
import java.util.Map;


public final class Activity {
    
    public static Map<String, Double> ACTIVITIES = new HashMap<String, Double>();
    
    static
    {
        ACTIVITIES.put("Минимальный (поход до магазина)", 1.2);
        ACTIVITIES.put("Слабый (1 - 2 раза в неделю)", 1.375);
        ACTIVITIES.put("Средний (3 раза в неделю)", 1.55);
        ACTIVITIES.put("Высокий (4 - 5 раз в неделю)", 1.725);
        ACTIVITIES.put("Экстра (тяжелый физический труд)", 1.9);
        
    }

    private Activity() {}
}
