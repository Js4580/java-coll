package part_number_two.£part.Java_Collections_Framefork.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Тройка");

        System.out.println(map);
        map.put(3, "Другое значение для ключа Три");
        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.get(311));
        System.out.println(map.values());
    }
}
