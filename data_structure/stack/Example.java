package data_structure.stack;

import java.util.Stack;

public class Example {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.contains(1));
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());

        stack.clear();
        System.out.println(stack);
        //System.out.println(stack.pop());       //오류 발생 (예외발생)

    }
}
