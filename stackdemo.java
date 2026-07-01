package lab08;

import java.util.Stack;

public class stackdemo {
    public static void main(String[] args) {

        // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // Store 10 elements
        stack.push(23);
        stack.push(33);
        stack.push(43);
        stack.push(53);
        stack.push(33);
        stack.push(63);
        stack.push(73);
        stack.push(83);
        stack.push(93);
        stack.push(13);

        // Display original stack
        System.out.println(stack);

        // Remove 4 elements
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        // Display remaining elements
        System.out.println("After remove");
        System.out.println(stack);
    }
}
