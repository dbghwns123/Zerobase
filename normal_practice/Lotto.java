package normal_practice;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[로또 당첨 프로그램]");
        System.out.println();
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int lottoCount = scanner.nextInt();

        if (lottoCount <= 0 || lottoCount > 10) {                            //로또 개수 1 ~ 10 이 아니면 실행 x
            System.out.println("로또 개수를 확인하시고 프로그램을 다시 실행하세요.");
        } else {
            printLotto(lottoCount);
        }

    }

    public static void printLotto(int lottoCount) {      //입력받은 로또 개수에 따른 로또 번호 출력 메서드
        Random random = new Random();
        int lottoNum = 6;                                //로또 숫자 6개
        int[][] lottoArr = new int[lottoCount][lottoNum];  //입력받은 로또 개수를 행, 로또 6자리를 열로 배열 생성

        for (int i = 0; i < lottoCount; i++) {
            for (int j = 0; j < lottoNum; j++) {
                lottoArr[i][j] = random.nextInt(45) + 1;      //lottoArr 배열에 1 ~ 45 까지의 랜덤 숫자 배정
                for (int k = 0; k < j; k++) {                        //중복제거
                    if (lottoArr[i][j] == lottoArr[i][k]) {          //  "
                        j--;                                         //  "
                    }
                }
            }
        }

        for (int k = 0; k < lottoCount; k++) {                         //정렬
            for (int i = 0; i < (lottoNum - 1); i++) {
                for (int j = i + 1; j <= (lottoNum - 1); j++) {
                    if (lottoArr[k][i] > lottoArr[k][j]) {
                        int temp = lottoArr[k][j];
                        lottoArr[k][j] = lottoArr[k][i];
                        lottoArr[k][i] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < lottoCount; i++) {
            int asciiNum = 65 + i;                                            //알파벳 A,B,C ... 출력
            String str = new Character((char) asciiNum).toString();
            System.out.print(str + "\t");
            for (int j = 0; j < lottoNum; j++) {                             ////출력할때 제일 마지막 끝 , 없애기
                if (j == (lottoNum - 1)) {
                    System.out.print(String.format("%02d", lottoArr[i][j]));
                } else {
                    System.out.print(String.format("%02d,", lottoArr[i][j]));
                }
            }
            System.out.println();
        }
        System.out.println();

        lottoAnnounce(lottoArr,lottoCount);            //lottoAnnounce 메서드에 lottoArr, lottoCount 를 인자로 넘겨줌
    }

    public static void lottoAnnounce(int[][] lottoArr,int lottoCount) {    //로또 발표 부분 메서드(lottoArr, lootCount를 매개변수로 가짐
        Random random = new Random();
        int lottoNum = 6;
        int[] lottoAnounceArr = new int[lottoNum];

        System.out.println("[로또 발표]");
        System.out.print("\t");
        for (int i = 0; i < lottoNum; i++) {
            lottoAnounceArr[i] = random.nextInt(45)+1;
            for (int j = 0; j < i; j++) {
                if (lottoAnounceArr[i] == lottoAnounceArr[j]) {       //중복 배제
                    i--;
                }
            }
        }
        for (int i = 0; i < (lottoNum - 1); i++) {                     //정렬
            for (int j = i + 1; j <= (lottoNum - 1); j++) {
                if (lottoAnounceArr[i] > lottoAnounceArr[j]) {
                    int temp = lottoAnounceArr[j];                     //정렬용 변수 temp 생성하여 더 작은 값을 앞으로 보냄
                    lottoAnounceArr[j] = lottoAnounceArr[i];
                    lottoAnounceArr[i] = temp;
                }
            }
        }
        for (int i = 0; i < lottoNum; i++) {                       //출력할때 제일 마지막 끝 , 없애기
            if (i == (lottoNum - 1)) {
                System.out.print(String.format("%02d", lottoAnounceArr[i]));
            } else {
                System.out.print(String.format("%02d,", lottoAnounceArr[i]));
            }
        }
        System.out.println();
        System.out.println();

        int[] numEqual = new int[lottoCount];              //내 로또 결과에 출력할 n개 일치 부분 출력 위해 로또 개수만큼 배열 생성
        for (int i = 0; i < lottoCount; i++) {
            for (int j = 0; j < lottoNum; j++) {
                for (int k = 0; k < lottoNum; k++) {
                    if (lottoAnounceArr[j] == lottoArr[i][k]) {      //번호가 일치할때마다
                        numEqual[i]++;                               //numEqual 배열의 i 인덱스 숫자 1 증가
                    }
                }
            }
        }

        System.out.println("[내 로또 결과]");
        for (int i = 0; i < lottoCount; i++) {
            int asciiNum = 65 + i;                                   //알파벳 A,B,C ...
            String str = new Character((char) asciiNum).toString();
            System.out.print(str + "\t");
            for (int j = 0; j < lottoNum; j++) {                     //출력할때 제일 마지막 끝 , 없애기
                if (j == (lottoNum - 1)) {
                    System.out.print(String.format("%02d", lottoArr[i][j]));
                } else {
                    System.out.print(String.format("%02d,", lottoArr[i][j]));
                }
            }
            System.out.print(" => " + numEqual[i] + "개 일치");
            System.out.println();
        }

    }
}
