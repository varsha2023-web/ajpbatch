package lab07;

import java.util.ArrayList;
import java.util.Collections;

public class reverselist {
    public static void main(String[] args) {

        // Create a list of strings
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        // Display original list
        System.out.println("Original list: " + list);

        // Reverse the list
        Collections.reverse(list);

        // Display reversed list
        System.out.println("Reversed list: " + list);
    }
}