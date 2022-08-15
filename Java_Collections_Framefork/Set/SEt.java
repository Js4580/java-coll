package part_number_two.£part.Java_Collections_Framefork.Set;

import java.util.HashSet;
import java.util.Set;

public class SEt {
    public static void main(String[] args) {
        Set<Integer> hashSet_one = new HashSet<>();
        for (int index = 0; index <= 5; index++) {
            hashSet_one.add(index);
        }
        Set<Integer> hashSet_two = new HashSet<>();
        for (int index = 2; index <= 7; index++) {
            hashSet_two.add(index);
        }

        //union - объединение множеств
        Set<Integer> union = new HashSet<>(hashSet_one);
        union.addAll(hashSet_two);

        System.out.println(union);

        // intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(hashSet_one);
        intersection.retainAll(hashSet_two);

        System.out.println(intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(hashSet_one);
        difference.removeAll(hashSet_two);

        System.out.println(difference);
    }
}
