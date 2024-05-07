package linear_data_structure.hint_problem._0422;

//https://school.programmers.co.kr/learn/courses/30/lessons/120813?language=java   (짝수는 싫어요)

public class _1 {
    public static void main(String[] args) {


    }
    public int[] solution(int n) {
        int[] answer = {};
        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = i * 2 + 1;
        }
        return answer;

        // return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();    스트림을 활용한 풀이
    }
}
