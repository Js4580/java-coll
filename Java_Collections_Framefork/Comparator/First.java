package part_number_two.£part.Java_Collections_Framefork.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class First {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");

//        Collections.sort(animals, new StringLengthComparator());
        animals.sort(new StringLengthComparator());

        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);
//        Collections.sort(numbers);
//        вот так вот
//        numbers.sort(new BackwardsIntegerComparator());
//        ну или не создавать новый класс для лишь одного метода, который переписываем
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(numbers);
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
        if (o1.length() > o2.length())
            return 1;
        else if (o1.length() < o2.length())
            return -1;
        else
            return 0;
    }
}

class BackwardsIntegerComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
        /*if (o1 > o2)
            return 1;
        else if (o1 < o2)
            return -1;
        else
            return 0;*/
        return o2.compareTo(o1);
    }
}
