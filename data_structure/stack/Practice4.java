package data_structure.stack;

import java.util.Stack;

public class Practice4 {

    public static void main(String[] args) {
        String s1 = "tree";
        String s2 = "th#ree";
        System.out.println(stringCompare(s1, s2));

        s1 = "ab#a";
        s2 = "aab#";
        System.out.println(stringCompare(s1, s2));

        s1 = "wo#w";
        s2 = "ww#o";
        System.out.println(stringCompare(s1, s2));
    }

    public static boolean stringCompare(String s1, String s2) {
        String str1 = doBackspace(s1);
        String str2 = doBackspace(s2);

        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    public static String doBackspace(String s) {
        Stack stack = new Stack();

        for (char c : s.toCharArray()) {
            if (c == '#' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return String.valueOf(stack);
    }
}
