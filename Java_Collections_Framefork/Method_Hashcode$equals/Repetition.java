package part_number_two.£part.Java_Collections_Framefork.Method_Hashcode$equals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Repetition {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Set<Integer> hashSet = new HashSet<>();
        hashMap.put(1, "Один");
        hashMap.put(1, "Другое значение");

        hashSet.add(1);
        hashSet.add(1);
        System.out.println(hashMap);
        System.out.println(hashSet);
    }
}
