package data_structure.array;

public class Practice2 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 100, 1, 1, 1, 100};
        int target = 100;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                result = i;
            }
        }
        System.out.println(result);
    }
}
