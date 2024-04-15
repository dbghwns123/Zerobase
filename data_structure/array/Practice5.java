package data_structure.array;

import java.util.Arrays;

public class Practice5 {

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 4, 6, 1};
        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
