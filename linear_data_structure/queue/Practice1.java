package linear_data_structure.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(findLastCard(4));   //4
        System.out.println(findLastCard(7));   //6
        System.out.println(findLastCard(9));   //2

    }

    public static int findLastCard(int N) {
        Queue<Integer> queue = new LinkedList();

        IntStream.rangeClosed(1, N).forEach(i -> queue.add(i));
        System.out.println(queue);
//        for (int i = 0; i < N; i++) {
//            queue.add(i + 1);
//        }
        while (queue.size() > 1) {
            queue.remove();
            int data = queue.remove();
            queue.add(data);
            System.out.println(queue);
        }
        return queue.remove();


    }

}
