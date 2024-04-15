package data_structure.stack;

import java.util.Stack;

public class Practice2 {

    public static void main(String[] args) {
        checkParenthesis("(");
        checkParenthesis(")");
        checkParenthesis("()");
        checkParenthesis("()()()");
        checkParenthesis("(())()");
        checkParenthesis("(((()))");
    }

    public static void checkParenthesis(String str) {
        Stack stack = new Stack();
        boolean check = true;

        for (String s : str.split("")) {
            if (s.equals("(")) {
                stack.push(s);
            } else {
                if (stack.isEmpty()) {
                    check = false;
                } else {
                    stack.pop();
                }
            }
        }
        if (check && stack.isEmpty()) {
            System.out.println("PASS!");
        } else {
            System.out.println("FAIL!");
        }
    }
}
