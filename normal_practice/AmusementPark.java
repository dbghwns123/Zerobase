package normal_practice;

import java.util.Scanner;

public class AmusementPark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = 10000;
        int discount = 0;

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = scanner.nextInt();
        if (age < 3) {
            discount = 10000;
        } else if (age < 13) {
            discount = 6000;
        }

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = scanner.nextInt();
        if (time >= 17) {
            if (discount <= 6000) {
                discount = 6000;
            }
        }
        scanner.nextLine(); //이전에 입력된 개행문자 제거

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String nationalMerit = scanner.nextLine();
        if (nationalMerit.equals("y")) {
            if (discount <= 2000) {
                discount = 2000;
            }
        }

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String welfareCard = scanner.nextLine();
        if (welfareCard.equals("y")) {
            if (discount <= 2000) {
                discount = 2000;
            }
        }
        price -= discount;
        System.out.println("입장료:" + price);
    }
}
