package data_structure.array;

public class Practice1 {

    public static void main(String[] args) {

        int evenNum = 0;
        int oddNum = 0;

        double even = 0;
        double odd = 0;

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i : arr) {
            if (i % 2 == 1) {
                odd += i;
                oddNum++;
            } else {
                even += i;
                evenNum++;
            }
        }
        even /= evenNum;
        odd /= oddNum;
        System.out.println("결과 :");
        System.out.println("짝수 평균: " + even);
        System.out.println("홀수 평균: " + odd);
    }
}
