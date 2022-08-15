package part_number_two.£part.Java_Collections_Framefork.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_implements {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        /*hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Jasmin");
        hashSet.add("JN");
        hashSet.add("Donald");*/

        /*linkedHashSet.add("Mike");
        linkedHashSet.add("Katy");
        linkedHashSet.add("Jasmin");
        linkedHashSet.add("JN");
        linkedHashSet.add("Donald");*/

        hashSet.add("Zik");
        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Jasmin");
        hashSet.add("JN");
        hashSet.add("Donald");
        /*for (String name:
                treeSet) {
            System.out.println(name);
        }*/
        System.out.println(hashSet.contains("Jasmin"));
        System.out.println(hashSet.contains("Tim"));
    }
}
