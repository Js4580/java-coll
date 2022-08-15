package part_number_two.£part.Java_Collections_Framefork.Stack;

import java.util.Stack;

public class Stack_first {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.empty());
        while(!stack.empty())
            System.out.println(stack.pop());
    }
}
