
package part_number_two.£part.Java_Collections_Framefork.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Add$offer {
    public static void main(String[] args) {
        People_JN person1 = new People_JN(1);
        People_JN person2 = new People_JN(2);
        People_JN person3 = new People_JN(3);
        People_JN person4 = new People_JN(4);

        Queue<People_JN> people = new ArrayBlockingQueue<>(3);
//        C ними как видим throws Exception
        /*people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);*/

//        С ними как видим возвращает спец. value
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));


    }
}

class People_JN {
    private int id;

    public People_JN(int id) {
        this.id = id;
    }

    @Override
    public String
    toString() {
        return "People_JN{" +
                "id=" + id +
                '}';
    }
}
