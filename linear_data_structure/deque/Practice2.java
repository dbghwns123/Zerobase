package linear_data_structure.deque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Practice2 {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("a"));
        System.out.println(checkPalindrome("aba"));
        System.out.println(checkPalindrome("abba"));
        System.out.println(checkPalindrome("abab"));
        System.out.println(checkPalindrome("abcba"));
        System.out.println(checkPalindrome("abccba"));
        System.out.println(checkPalindrome("madam"));
    }

    public static boolean checkPalindrome(String str) {
        Deque<String> deque = new ArrayDeque();
        boolean isFront = true;
        boolean isPalindrome = true;

        for (String s : str.split("")) {
            deque.addLast(s);
        }
//        for (char c : str.toCharArray()) {
//            deque.addLast(c);
//        }

        while (!deque.isEmpty()) {
            String data1 = deque.pollFirst();
            String data2 = deque.pollLast();
            if (data1 != null && data2 != null && !data1.equals(data2)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
