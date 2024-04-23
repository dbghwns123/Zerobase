package data_structure.linked_list;

public class Practice2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addData(1);
        list.addData(3);
        list.addData(5);
        list.addData(3);
        list.addData(1);
        System.out.println(checkPalindrome(list));

    }

    public static boolean checkPalindrome(LinkedList list) {
        Node cur = list.head;
        Node left = list.head;
        Node right = null;

        int cnt = 0;
        while (cur != null) {
            cnt++;
            right = cur;
            cur = cur.next;
        }
        Node prev = right;
        for (int i = 0; i < cnt / 2; i++) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = left;
            while (right.next != prev) {
                right = right.next;
            }
        }
        return true;
    }
}
