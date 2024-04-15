package data_structure.array;

public class Practice3 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        for (int i = arr.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
