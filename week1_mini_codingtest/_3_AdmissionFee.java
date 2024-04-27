package week1_mini_codingtest;

import java.util.Scanner;

public class _3_AdmissionFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enterFee = 10000;

        System.out.println("[입장권 계산]");

        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int enterTime = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String national = sc.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String card = sc.next();

        if (age < 3) {
            enterFee = 0;
        } else if (age < 13 || enterTime >= 17) {
            enterFee = 4000;
        } else if ("y".equalsIgnoreCase(national) || "y".equalsIgnoreCase(card)) {
            enterFee = 8000;
        }

        System.out.println("입장료: " + enterFee);
    }
}
