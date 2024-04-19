package normal_practice;

import java.util.Random;
import java.util.Scanner;

public class VirtualElection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("총 진행할 투표수를 입력해 주세요.");
        int voteCount = scanner.nextInt();                         //투표수
        if (voteCount < 1 || voteCount > 10000) {                  //투표수 1 ~ 10000 이외의 값을 입력하면 확인 메세지 출력
            System.out.println("투표수를 확인해주시고 프로그램을 다시 실행해주세요.");
        } else {
            System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
            int candidateCount = scanner.nextInt();                    //후보자 수
            scanner.nextLine();                                        //이전에 입력된 개행문자 제거

            if (candidateCount < 2 || candidateCount > 10) {          //후보자 수는 2 ~ 10 사이의 값
                System.out.println("후보자 수를 확인하시고 프로그램을 다시 실행해주세요.");
            } else {
                String[] candidateArr = new String[candidateCount];       //후보자 수만큼 배열 생성

                for (int i = 0; i < candidateCount; i++) {
                    System.out.print((i + 1) + "번째 후보자이름을 입력해 주세요.");
                    String candidateName = scanner.nextLine();
                    candidateArr[i] = candidateName;
                }
                System.out.println();

                printVoteProgress(candidateCount,voteCount,candidateArr);   //printVoteProgress 메서드로 후보자수, 투표수, 후보자 배열을 인수로 넘겨줌
            }
        }
    }

    public static void printVoteProgress(int candidateCount, int voteCount,String[] candidateArr) {
        Random random = new Random();
        int[] voteProgress = new int[candidateCount];   //후보자들의 인덱스 배열과 동일하게 설정하여 투표수를 저장하는 배열 생성

        for (int i = 1; i <= voteCount; i++) {
            int num = random.nextInt(candidateCount);    //0 ~ (후보자 수 - 1)까지의 인덱스 번호를 num에 대입
            voteProgress[num]++;                         // 후보자들의 득표수를 하나씩 증가
            System.out.println("[투표진행률]: " + String.format("%.2f%%, %d명 투표 => %s", ((double)i / voteCount) * 100, i, candidateArr[num]));
            for (int j = 0; j < candidateCount; j++) {
                System.out.println("[기호:" + (j+1) + "] " + candidateArr[j] + ":\t" + String.format("%.2f%%\t(투표수: %d)", ((double) voteProgress[j] / voteCount) * 100, voteProgress[j]));
            }
            System.out.println();
        }
        int maxIndex = 0;                                //그 값에 맞는 인덱스를 for문의 i로 대입
        int maxVal = voteProgress[0];                    //가장 많은 투표수를 가진 값을 구하고 👆
        for (int i = 1; i < candidateCount; i++) {
            if (maxVal < voteProgress[i]) {
                maxVal = voteProgress[i];
                maxIndex = i;
            }
        }
        System.out.print("[투표결과] 당선인 : " + candidateArr[maxIndex]);

        for (int i = maxIndex + 1; i < candidateCount; i++) {           //투표수가 같은 경우에는 함께 출력
            if (maxVal == voteProgress[i]) {
                System.out.print(", " + candidateArr[i]);
            }
        }
    }
}
