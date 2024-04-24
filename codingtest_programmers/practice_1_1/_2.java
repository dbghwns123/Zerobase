package codingtest_programmers.practice_1_1;

public class _2 {
    public static void main(String[] args) {
        System.out.println(solution(23));
    }

    public static boolean solution(int num) {
        boolean answer = true;

        if ((num - 1) % 4 == 0) {
            answer = false;
        }

        return answer;
    }
}
