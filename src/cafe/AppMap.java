package cafe;

import java.util.HashMap;
import java.util.Map;

public class AppMap {

    public static void main(String[] args) {
        Map<String, Drink> drinkMap = new HashMap<>();
        drinkMap.put("D0001", new Drink("コーヒー", 350));
        drinkMap.put("D0002", new Drink("紅茶", 400));
        drinkMap.put("D0003", new Drink("ほうじ茶", 300));
    }

}
