package codingtest_programmers.practice_1_1;

public class _4 {
    public static void main(String[] args) {
        System.out.println(solution("174771177"));

    }

    public static int solution(String s) {
        int[] arr = new int[10];          // 0 ~ 9까지의 배열 생성 -> 인덱스와 숫자를 동일하게 해줌
        String[] str = s.split("");  //문자열 s를 하나씩 잘라서 str배열에 넣어줌

        for (String a : str) {
            int b = Integer.parseInt(a);    //하나씩 자른 문자열을 int형으로 변환   예) "1" -> 1
            arr[b]++;                       // arr 배열에 대입 , 값과 인덱스가 같음  예) arr[1] = 0 -> 1로 변환
        }
        int result = -1;                   //arr 배열에 들어가 있는 숫자의 개수 중 가장 큰 값을 비교하면서 찾기 위해 선언한 변수
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result) {
                result = arr[i];
                answer = i;
            }
        }
        return answer;
    }
}
