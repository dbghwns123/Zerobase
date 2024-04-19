package normal_practice;

import java.util.Random;
import java.util.Scanner;

public class IdentificationNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("[주민등록번호 계산");
        System.out.print("출생년도를 입력해 주세요.(yy):");
        int birth_year = scanner.nextInt();
        birth_year %= 100;
        System.out.print("출생월을 입력해 주세요.(mm):");
        int birth_month = scanner.nextInt();
        System.out.print("출생일을 입력해 주세요.(dd):");
        int birth_day = scanner.nextInt();

        scanner.nextLine(); //이전에 입력된 개행문자 제거

        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = scanner.nextLine();

        if (gender.equals("m")) {                                      //성별이 남자면
            int male = 3;
            System.out.print(String.format("%2d%02d%02d-%d", birth_year, birth_month, birth_day, male));  //format 함수로 생년월일 - 성별까지 출력
            System.out.print(random.nextInt(999999)+1);        //임의번호 6자리 출력 ( 1 ~ 999999 사이의 값)
        } else if (gender.equals("f")) {                             //성별이 여자면
            int female = 4;
            System.out.print(String.format("%2d%02d%02d-%d", birth_year, birth_month, birth_day, female));
            System.out.print(random.nextInt(999999)+1);
        }
    }
}

