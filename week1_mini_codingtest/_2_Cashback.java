package week1_mini_codingtest;

import java.util.Scanner;

public class _2_Cashback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        int pay = sc.nextInt();
        int cashback = pay / 10;
        cashback -= cashback % 100;

        if (cashback > 300) {
            cashback = 300;
        }
        System.out.println("결제 금액은 " + pay + "원이고, 캐시백은 " + cashback + "원 입니다.");

    }
}
