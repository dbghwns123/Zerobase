package linear_data_structure.array;

public class Practice5 {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 6, 1};
        int[] visited = new int[arr.length];
        int visitCnt = 0;
        int minVal = Integer.MAX_VALUE;
        int minIdx = -1;

        while (visitCnt < arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minVal && visited[i] == 0) {
                    minVal = arr[i];
                    minIdx = i;
                }
            }
            if (minIdx != -1) {
                System.out.println(minVal + " ");
                visited[minIdx] = 1;
                visitCnt++;
            }
            minVal = Integer.MAX_VALUE;
            minIdx = -1;
        }
        System.out.println();



        /*int[] arr = {5, 3, 1, 4, 6, 1};
        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];                                    //혼자 풀어본 방식
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));*/

    }
}
