package linear_data_structure.deque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.stream.IntStream;

public class Practice1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        reorderData(arr);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        reorderData(arr2);
    }

    public static void reorderData(int[] arr) {
        Deque<Integer> deque = new ArrayDeque();
        ArrayList result = new ArrayList();

//        for (int i : arr) {
//            deque.addLast(i);
//        }
        IntStream.of(arr).forEach(i -> deque.addLast(i));
        System.out.println(deque);

        while (!deque.isEmpty()) {
            result.add(deque.removeFirst());
            if (!deque.isEmpty()) {
                result.add(deque.removeLast());
            }
        }

        System.out.println("== 정렬 전 ==");
        printData(arr);
        System.out.println("== 정렬 후 ==");
        printData(result.stream().mapToInt(x -> (int) x).toArray());
    }

    public static void printData(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " -> ");
        }
        System.out.println(arr[arr.length - 1]);
    }

}
