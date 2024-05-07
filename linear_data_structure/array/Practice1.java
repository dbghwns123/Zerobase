package linear_data_structure.array;

public class Practice1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int evenSum = 0;
        int oddSum = 0;

        int evenCnt = 0;
        int oddCnt = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                evenSum += i;
                evenCnt++;
            } else {
                oddSum += i;
                oddCnt++;
            }

        }
        System.out.println("짝수 평균: " + (double) evenSum / evenCnt);
        System.out.println("홀수 평균: " + (double) oddSum / oddCnt);

    }
}
