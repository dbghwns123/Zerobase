package normal_practice;

import java.util.Scanner;

public class Cashback {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        int price = scanner.nextInt();
        int cashback = 0;

        if (price / 10 >= 300) {
            cashback = 300;
            System.out.println("결제 금액은 " + price + "원이고, " + "캐시백은 " + cashback + "원 입니다.");
        } else if (price / 10 >= 200) {
            cashback = 200;
            System.out.println("결제 금액은 " + price + "원이고, " + "캐시백은 " + cashback + "원 입니다.");
        } else if (price / 10 >= 100) {
            cashback = 100;
            System.out.println("결제 금액은 " + price + "원이고, " + "캐시백은 " + cashback + "원 입니다.");
        }
    }
}
