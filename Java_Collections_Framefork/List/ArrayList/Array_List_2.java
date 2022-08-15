package part_number_two.£part.Java_Collections_Framefork.List.ArrayList;

import java.util.ArrayList;

public class Array_List_2 {
    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<>();
        for (int index = 0; index < 5; index++)
            array_list.add(index);
        array_list.remove(3);
        System.out.println(array_list);
    }
}
