package lab08;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("banana");
        set.add("date");
        set.add("apple");

        // Append the specified element
        set.add("cherry");

        // Display the updated HashSet
        System.out.println("Updated HashSet: " + set);
    }
}