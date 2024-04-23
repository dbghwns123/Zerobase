package data_structure.linked_list;

// 선형 자료구조 - 연결 리스트
// 단순 연결 리스트 (simple ver.) 기본 구조 구현

// 노드
class Node {            //노드 클래스
    int data;           //데이터
    Node next;          //링크

    Node() {}
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    Node head;
    LinkedList() {}
    LinkedList(Node node) {
        this.head = node;
    }


    //  연결 리스트 비어있는지 확인
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    //  연결 리스트의 맨 뒤에 데이터 추가
    public void addData(int data) {
        if (this.head == null) {        //this.head 가 비어있으면 노드를 바로 생성해줌
            this.head = new Node(data, null);
            return;
        } else {
            Node cur = this.head;      //cur Node를 생성해주고 거기에 head를 대입시킴
            while (cur.next != null) {    //cur의 next가 null이 아니면
                cur = cur.next;           //다음 노드로 이동
            }
            cur.next = new Node(data, null);
        }
    }

    //  연결 리스트의 맨 뒤의 데이터 삭제
    public void removeData() {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        } else {
            Node cur = this.head;      //cur은 현재 노드를 가리키기 위해 선언
            Node prev = cur;           //prev는 현재 노드의 전 노드를 가리키기 위해 선언
            while (cur.next != null) {
                prev = cur;            //prev는 이전 노드
                cur = cur.next;        //cur은 현재 노드
            }
            if (cur == this.head) {      //cur과 head가 같다는 것은 현재 노드가 head밖에 없다는것
                this.head = null;
            } else {
                prev.next = null;        //cur 이전 노드인 prev.next를 null로 바꿔주면서 가비지 컬렉션에 의해 마지막 노드 삭제
            }
        }
    }

    //  연결 리스트에서 데이터 찾기
    public boolean findData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
        }
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == data) {
                System.out.println("Data is exist");
                return true;
            }
            cur = cur.next;
        }
        System.out.println("Data not found");
        return false;
    }

    //  연결 리스트의 모든 데이터 출력
    public void showData() {
        if (this.isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node cur = this.head;
            while (cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
        }
        System.out.println();
    }
}


public class Example_Simple {

    public static void main(String[] args) {

//      Test Code
        LinkedList myList = new LinkedList(new Node(1, null));
        myList.showData();      // 1

        myList.addData(2);
        myList.addData(3);
        myList.addData(4);
        myList.addData(5);
        myList.showData();      // 1 2 3 4 5

        myList.findData(3);     // Data exist!
        myList.findData(100);   // Data not found!

        myList.removeData();
        myList.removeData();
        myList.removeData();
        myList.showData();      // 1 2

        myList.removeData();
        myList.removeData();
        myList.removeData();    // List is empty

    }

}
