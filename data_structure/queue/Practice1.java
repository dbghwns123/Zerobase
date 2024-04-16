package data_structure.queue;

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

        /*for (int i = 1; i < N+1; i++) {                        //for문으로 값 넣기
            queue.add(i);
        }*/

        IntStream.range(1, N + 1).forEach(x -> queue.add(x));    //IntStream, forEach, 람다식으로 값 넣기
        System.out.println(queue);

        while (queue.size() > 1) {
            queue.remove();                  //remove도 가능
            int data = queue.remove();       //     "
            queue.add(data);
            System.out.println(queue);
        }
        return queue.remove();
    }
}
