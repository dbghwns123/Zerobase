package codingtest_programmers.practice_1_1;

public class _3 {
    public static void main(String[] args) {
        int[] A = {100000, 91000, 92000, 95000, 97000, 90000};
        System.out.println(solution(A));

    }

    public static int solution(int[] A) {
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int dif = A[j] - A[i];
                if (answer < dif) {
                    answer = dif;
                }
            }
        }

        return answer;
    }
}
