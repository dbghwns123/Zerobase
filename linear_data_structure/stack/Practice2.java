package linear_data_structure.stack;

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
        Stack<String> stack = new Stack<>();
        boolean checkFlag = true;

        for (String s : str.split("")) {
            if (s.equals("(")) {
                stack.push(s);
            } else {
                if (stack.isEmpty()) {
                    checkFlag = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty() && checkFlag) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
