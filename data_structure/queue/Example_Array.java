package data_structure.queue;

// Practice2
// 배열을 이용한 기본 큐 직접 구현 (원형 큐)

class MyQueue2 {
    int[] arr;
    int front = 0;
    int rear = 0;

    MyQueue2(int size) {
        arr = new int[size + 1];
    }

    public boolean isEmpty() {
        return this.front == this.rear;

    }

    public boolean isFull() {
        return (this.rear + 1) % this.arr.length == this.front;
    }

    public void enqueue(int data) {
        if (this.isFull()) {
            System.out.println("Queue is full");
            return;
        }
        this.rear = (this.rear + 1) % arr.length;
        arr[rear] = data;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        front = (front + 1) % arr.length;
        return this.arr[front];
    }

    public void printQueue() {
        int start = (front + 1) % arr.length;
        int end = (rear + 1) % arr.length;
        for (int i = start; i != end; i = (i + 1) % arr.length) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class Example_Array {
    public static void main(String[] args) {
        // Test code
        MyQueue2 myQueue = new MyQueue2(5);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6); // Queue is full!

        myQueue.printQueue();   // 1, 2, 3, 4, 5

        System.out.println(myQueue.dequeue());  // 1
        myQueue.printQueue();   // 2, 3, 4, 5

        System.out.println(myQueue.dequeue());  // 2
        myQueue.printQueue();   // 3, 4, 5

        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.printQueue();   // 3, 4, 5, 6, 7

        System.out.println(myQueue.dequeue());  // 3
        System.out.println(myQueue.dequeue());  // 4
        System.out.println(myQueue.dequeue());  // 5
        myQueue.printQueue();   // 6, 7
        System.out.println(myQueue.dequeue());  // 6
        System.out.println(myQueue.dequeue());  // 7
        myQueue.dequeue();      // Queue is empty!
    }
}
