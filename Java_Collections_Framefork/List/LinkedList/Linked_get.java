package part_number_two.£part.Java_Collections_Framefork.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_get {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {
        for (int index = 0; index < 100_000; index++) {
            list.add(index);
        }
        long start = System.currentTimeMillis();
        for (int index = 0; index < 100_000; index++) {
            list.get(index);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
