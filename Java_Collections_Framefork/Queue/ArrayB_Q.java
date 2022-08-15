package part_number_two.£part.Java_Collections_Framefork.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayB_Q {
    public static void main(String[] args) {
        People person1 = new People(1);
        People person2 = new People(2);
        People person3 = new People(3);
        People person4 = new People(4);

        Queue<People> people = new ArrayBlockingQueue<>(10);
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);
        System.out.println(people.remove());
        System.out.println(people.peek());
        System.out.println(people);

    }
}

class People {
    private int id;

    public People(int id) {
        this.id = id;
    }

    @Override
    public String
    toString() {
        return "People{" +
                "id=" + id +
                '}';
    }
}
