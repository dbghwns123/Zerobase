package linear_data_structure.hint_problem._0422;

// https://school.programmers.co.kr/learn/courses/30/lessons/81301  숫자 문자열과 영단어


class Solution {
    public int solution(String s) {
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for (int i = 0; i < arr.length; i++) {
            s = s.replace(arr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}

public class _2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("one4seveneight"));

    }
}
