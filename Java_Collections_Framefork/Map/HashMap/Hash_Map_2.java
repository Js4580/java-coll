package part_number_two.£part.Java_Collections_Framefork.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map_2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Тройка");
        for (Map.Entry<Integer, String> entry:
                map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
