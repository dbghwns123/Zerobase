package linear_data_structure.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Practice2 {

    public static void main(String[] args) {
        System.out.println(getJosephusPermutation(5,2));
        System.out.println(getJosephusPermutation(7, 3));
    }

    public static ArrayList getJosephusPermutation(int N, int K) {
        ArrayList result = new ArrayList();
        Queue<Integer> queue = new LinkedList();

        IntStream.rangeClosed(1, N).forEach(i -> queue.add(i));

        int cnt = 0;
        while (!queue.isEmpty()) {
            int data = queue.remove();
            if (++cnt % K == 0) {
                result.add(data);
            } else {
                queue.add(data);
            }
        }
        return result;
    }
}
