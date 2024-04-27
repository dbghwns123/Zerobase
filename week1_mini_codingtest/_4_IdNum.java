package week1_mini_codingtest;

import java.util.Random;
import java.util.Scanner;

public class _4_IdNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        System.out.print("출생월을 입력해 주세요.(mm):");
        int month = sc.nextInt();
        System.out.print("출생일을 입력해 주세요.(dd):");
        int day = sc.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = sc.next();

        String idNum = createId(year, month, day, gender);
        System.out.println(idNum);

    }
    public static String createId(int year,int month,int day,String gender) {

        int min = 111111;
        int max = 999999;
        Random random = new Random();
        int seq = random.nextInt(max - min + 1) + min;

        int genderVal = "m".equalsIgnoreCase(gender)? 3 : 4;
        String idNum = String.format("%02d%02d%02d - %d%06d",year % 100,month,day,genderVal,seq);
        return idNum;

    }
}
