package part_number_two.£part.Java_Collections_Framefork.List.ArrayList;

import java.util.ArrayList;
public class Array_List_1 {
    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<>();
        for (int index = 0; index < 100; index++)
            array_list.add(index);

        /*System.out.println(array_list);

        System.out.println(array_list.get(1));
        System.out.println(array_list.get(87));
        System.out.println(array_list.size());*/
        for (int index = 0; index < array_list.size(); index++)
            System.out.println(array_list.get(index));

        for (Integer one:
             array_list)
            System.out.println(one);
    }
}
