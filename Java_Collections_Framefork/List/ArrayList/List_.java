package part_number_two.£part.Java_Collections_Framefork.List.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < 5; index++)
            list.add(index);
        list.remove(3);
        System.out.println(list);
        list = new LinkedList<>();

    }
}
