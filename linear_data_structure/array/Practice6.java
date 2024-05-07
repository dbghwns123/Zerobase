package linear_data_structure.array;

import java.util.HashSet;

public class Practice6 {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
//        HashSet<Integer> hs = new HashSet<>();
//        for (int i : arr) {
//            hs.add(i);                               //HashSet를 이용하여 중복제거하는 방법
//        }
//        System.out.println(hs);
        int[] result = new int[arr.length];
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean dupFlag = false;
            for (int j = 0; j < num; j++) {
                if (arr[i] == result[j]) {
                    dupFlag = true;
                }
            }
            if (!dupFlag) {
                result[num++] = arr[i];
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
