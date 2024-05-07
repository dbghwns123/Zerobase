package linear_data_structure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example {

    public static void main(String[] args) {
        Queue queue = new LinkedList();            //큐는 new LinkedList(); 로 해줘야함

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.contains(3));
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

        queue.clear();
        System.out.println(queue);
        System.out.println(queue.poll());    //스택은 클리어하고 pop 하면 예외발생하지만 queue는 null반환


    }
}
