package data_structure.stack;

import java.util.Stack;

public class Practice1 {

    public static void main(String[] args) {

        String result = reverseString("Hello");
        System.out.println("result = " + result);

        result = reverseString("1 3 5 7 9");
        System.out.println("result = " + result);
    }

    public static String reverseString(String str) {
        Stack stack = new Stack();
        String result = "";

        for (String s : str.split("")) {
            stack.push(s);
        }
        while (stack.isEmpty() == false) {
            result += stack.pop();
        }


        return result;
    }
}
