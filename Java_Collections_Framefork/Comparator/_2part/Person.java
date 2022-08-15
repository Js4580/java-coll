package part_number_two.£part.Java_Collections_Framefork.Comparator._2part;

import java.util.*;

class Test {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);
//        либо так
        Collections.sort(peopleList);
//        либо так
        peopleList.sort(Person::compareTo);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void addElements(Collection<Person> collection) {
        collection.add(new Person(4, "George"));
        collection.add(new Person(1, "Bob"));
        collection.add(new Person(3, "Katy"));
        collection.add(new Person(2, "Mike"));
        collection.add(new Person(5, "a"));
        collection.add(new Person(5, "a"));
    }
}

public class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    //по id
    /*@Override
    public int compareTo(Person o) {
        return Integer.compare(this.getId(), o.getId());
        *//*if (this.getId() > o.getId())return 1;
        else if (this.getId() < o.getId())return -1;
        else return 0;*//*
    }*/
//по name length
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.getName().length(), o.getName().length());
    }
}
