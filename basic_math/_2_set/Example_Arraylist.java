package basic_math._2_set;

// Practice
// ArrayList를 사용한 집합 구현 실습 (집합 관련 연산 사용 X)

import java.util.ArrayList;

class MySet {
    // ArrayList
    ArrayList<Integer> list;

    // 생성자1
    MySet() {
        this.list = new ArrayList<Integer>();
    }

    // 생성자 2
    MySet(int[] arr) {
        this.list = new ArrayList<Integer>();
        for (int i : arr) {
            this.list.add(i);
        }
    }

    // 원소 추가 (중복 X)
    public void add(int x) {
        for (int i : this.list) {
            if (i == x) {
                return;
            }
        }
        this.list.add(x);
    }

    // 교집합
    public MySet retainAll(MySet b) {
        MySet result = new MySet();
        for (int itemA : this.list) {
            for (int itemB : b.list) {
                if (itemA == itemB) {
                    result.add(itemA);
                }
            }
        }
        return result;
    }


    // 합집합
    public MySet addAll(MySet b) {
        MySet result = new MySet();
        for (int itemA : this.list) {
            result.add(itemA);
        }
        for (int itemB : b.list) {
            result.add(itemB);
        }
        return result;
    }


    // 차집합
    public MySet removeAll(MySet b) {
        MySet result = new MySet();

        for (int itemA : this.list) {
            boolean checkFlag = false;

            for (int itemB : b.list) {
                if (itemA == itemB) {
                    checkFlag = true;
                    break;
                }
            }
            if (!checkFlag) {
                result.add(itemA);

            }
        }
        return result;
    }

}

public class Example_Arraylist {
    public static void main(String[] args) {

//      Test code
        MySet a = new MySet();

        a.add(1);
        a.add(1);
        a.add(1);
        System.out.println(a.list);
        a.add(2);
        a.add(3);
        System.out.println(a.list);

        a = new MySet(new int[]{1, 2, 3, 4, 5});
        MySet b = new MySet(new int[]{2, 4, 6, 8, 10});
        System.out.println("a: " + a.list);
        System.out.println("b: " + b.list);

        MySet result = a.retainAll(b);
        System.out.println("교집합: " + result.list);

        result = a.addAll(b);
        System.out.println("합집합: " + result.list);

        result = a.removeAll(b);
        System.out.println("차집합: " + result.list);
    }
}
