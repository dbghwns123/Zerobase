package linear_data_structure.linked_list;


// Practice1
// 단방향 연결 리스트에서 중복 데이터를 찾아 삭제하세요.

// 입출력 예시)
// 입력 연결 리스트: 1, 3, 3, 1, 4, 2, 4, 2
// 결과 연결 리스트: 1, 3, 4, 2


class Node1 {
    int data;
    Node next;

    Node1() {}
    Node1(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList1 {
    Node head;

    LinkedList1() {}
    LinkedList1(Node node) {
        this.head = node;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addData(int data) {
        if (this.head == null) {
            this.head = new Node(data, null);
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }
    }

    public void removeData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        Node pre = cur;
        while (cur != null) {
            if (cur.data == data) {
                if (cur == this.head) {
                    this.head = cur.next;
                } else {
                    pre.next = cur.next;
                }
                break;
            }

            pre = cur;
            cur = cur.next;
        }
    }

    public boolean findData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
        }

        Node cur = this.head;
        while (cur != null) {
            if (cur.data == data) {
//                System.out.println("Data exist!");
                return true;
            }
            cur = cur.next;
        }
//        System.out.println("Data not found!");
        return false;
    }

    public void showData() {
        if (this.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}


public class Practice1 {
    public static LinkedList1 removeDup(LinkedList1 listBefore) {
        LinkedList1 listAfter = new LinkedList1();

        Node cur = listBefore.head;
        while (cur != null) {
            if (listAfter.findData(cur.data) == false) {
                listAfter.addData(cur.data);
            }
            cur = cur.next;
        }
        return listAfter;
    }

    public static void main(String[] args) {
        // Test code
        LinkedList1 linkedList = new LinkedList1();
        linkedList.addData(1);
        linkedList.addData(3);
        linkedList.addData(3);
        linkedList.addData(1);
        linkedList.addData(4);
        linkedList.addData(2);
        linkedList.addData(4);
        linkedList.addData(2);
        linkedList.showData();  // 1 3 3 1 4 2 4 2

        linkedList = removeDup(linkedList);
        linkedList.showData();  // 1 3 4 2

    }
}
