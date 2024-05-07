package linear_data_structure.hint_problem._0422;

//https://www.acmicpc.net/problem/9012    백준 9012 ( 스택 ) - 괄호

import java.util.Scanner;
import java.util.Stack;

public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            System.out.println(checkVps(sc.next()));
        }
    }

    public static String checkVps(String s) {
        Stack<String> stack = new Stack();
        boolean checkFlag = true;
        String a = "";

        for (String i : s.split("")) {
            if ("(".equals(i)) {
                stack.push(i);
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
            a = "YES";
        } else {
            a = "NO";
        }
        return a;
    }
}
