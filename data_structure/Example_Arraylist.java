package data_structure.queue;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;

class MyQueue1 {
    ArrayList<Integer> list;

    MyQueue1() {
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
        if (this.list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        this.list.add(data);
    }

    public Integer pop() {
        if (this.isEmpty()) {
            System.out.println("queue is empty");
            return null;
        }
        int data = this.list.get(0);
        this.list.remove(0);
        return data;
    }

    public Integer peek() {
        if (this.list.isEmpty()) {
            System.out.println("queue is empty");
            return null;
        }
        int data = this.list.get(0);
        return data;
    }

    public void printQueue() {
        System.out.println(this.list);
    }

}

public class Example_Arraylist {

    public static void main(String[] args) {
        MyQueue1 myQueue1 = new MyQueue1();

        myQueue1.push(1);
        myQueue1.push(2);
        myQueue1.push(3);
        myQueue1.push(4);
        myQueue1.push(5);

        myQueue1.printQueue();

        System.out.println(myQueue1.peek());
        myQueue1.printQueue();

        System.out.println(myQueue1.pop());
        myQueue1.printQueue();

        System.out.println(myQueue1.pop());
        myQueue1.printQueue();

        System.out.println(myQueue1.pop());
        System.out.println(myQueue1.pop());
        System.out.println(myQueue1.pop());
        myQueue1.printQueue();

    }
}
