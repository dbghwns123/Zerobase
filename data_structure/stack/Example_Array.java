package data_structure.stack;

// Practice2
// 배열을 이용한 기본 스택 직접 구현

import java.util.Arrays;


class MyStack2 {
    int[] arr;
    int top = -1;

    MyStack2(int size) {
        arr = new int[size];
    }

    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (this.top == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        if (this.isFull()) {
            System.out.println("Stack is Full");
        } else {
            this.top += 1;
            this.arr[this.top] = data;
        }

    }

    public Integer pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            int data = this.arr[this.top];
            this.top -= 1;
            return data;
        }
    }

    public Integer peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            int data = this.arr[this.top];
            return data;
        }
    }

    public void printStack() {
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < this.top + 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Example_Array {
    public static void main(String[] args) {
        // Test code
        MyStack2 myStack = new MyStack2(5);
        myStack.isEmpty();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.printStack();               // 1, 2, 3, 4, 5

        System.out.println(myStack.peek()); // 5
        myStack.printStack();               // 1, 2, 3, 4, 5

        System.out.println(myStack.pop());  // 5
        System.out.println(myStack.pop());  // 4
        myStack.printStack();               // 1, 2, 3

        System.out.println(myStack.pop());  // 3
        System.out.println(myStack.pop());  // 2
        System.out.println(myStack.pop());  // 1
        myStack.printStack();
    }
}
