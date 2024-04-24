package codingtest_programmers.practice_1_1;

public class _1 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = n; i >= 1; i--) {
            answer += i;
        }
        return answer;
    }
}
