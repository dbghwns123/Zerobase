package data_structure.deque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.stream.IntStream;

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
        Deque deque = new ArrayDeque();
        boolean isFront = true;
        boolean isPalindrome = true;

        for (String s : str.split("")) {
            deque.addFirst(s);
        }
        while (!deque.isEmpty()) {
            String s1 = (String) deque.pollFirst();
            String s2 = (String) deque.pollLast();

            if (s1 != null && s2 != null && !s1.equals(s2)) {
                isPalindrome = false;
                break;
            }
        }


        return isPalindrome;
    }
}
