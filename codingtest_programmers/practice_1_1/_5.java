package codingtest_programmers.practice_1_1;

public class _5 {
    public static void main(String[] args) {
        System.out.println(solution("1101"));
    }

    public static int solution(String S) {

        int answer = Integer.parseInt(S, 2);
        int cnt = 0;
        while (answer > 0) {
            if (answer % 2 == 1) {
                answer -= 1;
            } else {
                answer /= 2;
            }
            cnt++;
        }

        return cnt;
    }
}
