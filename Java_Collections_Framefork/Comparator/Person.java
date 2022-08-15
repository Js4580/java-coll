package part_number_two.£part.Java_Collections_Framefork.Comparator;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }
}

class Test {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Make"));
        people.add(new Person(1, "Bob"));
        people.add(new Person(2, "Katy"));
        people.sort((sex, text) -> Integer.compare(sex.getId(), text.getId()));
        System.out.println(people);
    }
}