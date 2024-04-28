package basic_math._3_possibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

//      1. 합의 법칙
        System.out.println("== 합의 법칙 ==");
//      두 개의 주사를 던졌을 때 합이 3 또는 4의 배수일 경우의 수

        int[] dice1 = {1, 2, 3, 4, 5, 6};
        int[] dice2 = {1, 2, 3, 4, 5, 6};

        int nA = 0;
        int nB = 0;
        int nAandB = 0;

        // 기본 풀이
        for (int i : dice1) {
            for (int i1 : dice2) {
                if ((i + i1) % 3 == 0) {
                    nA++;
                }
                if ((i + i1) % 4 == 0) {
                    nB++;
                }
                if ((i + i1) % 12 == 0) {
                    nAandB++;
                }
            }
        }
        System.out.println("결과: " + (nA + nB - nAandB));


        // HashSet 이용
        HashSet<ArrayList> hs = new HashSet<>();
        for (int i : dice1) {
            for (int i1 : dice2) {
                if ((i + i1) % 3 == 0 || (i + i1) % 4 == 0) {
                    ArrayList list = new ArrayList(Arrays.asList(i, i1));
                    hs.add(list);
                }
            }
        }
        System.out.println("결과: " + hs.size());


//      2. 곱의 법칙
        System.out.println("== 곱의 법칙 ==");
//      두 개의 주사위 a, b를 던졌을 때 a는 3의 배수, b는 4의 배수인 경우의 수
        nA = 0;
        nB = 0;

        for (int i : dice1) {
            if (i % 3 == 0) {
                nA++;
            }
        }
        for (int i : dice2) {
            if (i % 4 == 0) {
                nB++;
            }
        }
        System.out.println("결과: " + (nA * nB));

    }
}
