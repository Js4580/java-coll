package part_number_two.£part.Java_Collections_Framefork.Map.LinkedHashMap$TreeMap;

import java.util.HashMap;
import java.util.Map;

public class Start {
    public static void main(String[] args) {
        Map<String, String> translation = new HashMap<>();
        translation.put("кошка","cat");
        translation.put("собака","dog");
        translation.put("слон","elephant");
        for (Map.Entry<String, String> shifting:
             translation.entrySet()) {
            System.out.println(shifting.getKey() + " : " + shifting.getValue());
        }
    }
}
