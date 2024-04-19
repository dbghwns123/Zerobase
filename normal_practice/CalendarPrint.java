package normal_practice;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy): ");
        int year = scanner.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm): ");
        int month = scanner.nextInt();

        LocalDate now = LocalDate.now();

        makeCalendar(year,month - 1);                   //입력 값 기준 이전달
        makeCalendar(year,month);                              //입력한 달
        makeCalendar(now.getYear(), now.getMonthValue());      //현재달
    }

    public static void makeCalendar(int year, int month) {              //출력하고 싶은 년도와 달을 매개변수로 가지는 메서드
        LocalDate localDate = LocalDate.of(year, month, 1);  //해당 년도와 달의 달력을 가져옴
        int day = localDate.getDayOfWeek().getValue();                  //해당 달이 시작하는 요일을 가져옴 (시작은 일 = 0)
        int monthLength = localDate.lengthOfMonth();                    //해당 달의 일수를 가져옴

        System.out.println(String.format("[%4d년 %02d월]",year,month));
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int i = 0; i < day; i++) {
            if (day == 7) {
                break;
            } else {
                System.out.print("\t");
            }
        }

        for (int i = 1; i < (monthLength + 1); i++) {
            System.out.print(String.format("%02d\t",i));
            day++;
            if (day % 7 == 0 ) {
                System.out.println();
            }
        }
        System.out.println();

    }
}
