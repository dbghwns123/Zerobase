package linear_data_structure.hint_problem._0422;

//https://www.acmicpc.net/problem/10807    백준 10807 (해시 테이블)  -개수 세기

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        //String str = "1 4 1 2 4 2 4 2 3 4 4";
        //int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        for (int i = 0; i < cnt; i++) {
            if (arr[i] == find) {
                count++;
            }
        }
        System.out.println(count);
    }
}
