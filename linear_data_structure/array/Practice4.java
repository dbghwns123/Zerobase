package linear_data_structure.array;

public class Practice4 {

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11};
        int[] result = {};

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
            } else if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + " ");
            } else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
