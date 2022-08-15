package part_number_two.£part.Java_Collections_Framefork.Map.LinkedHashMap$TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LHMap$TMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();//не гарантируется никакого порядка

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();//в каком порядке(key, value) были добавлены в таком порядке они и вернутся

        Map<Integer, String> treeMap = new TreeMap<>();//пары (key, value) сортируются по ключу(естественный порядок)

//        testMap(hashMap);
//        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(4580, "Jasmin");
        map.put(7, "Ki");
        map.put(2, "li");
        map.put(22, "Nike");
        for (Map.Entry<Integer, String> entry :
                map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
