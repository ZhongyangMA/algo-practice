package linkedlist;

/**
 * @author Zhongyang MA
 * @date Mar/18/2021
 * @description
 */
public class LinkList {

    public static class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public static Node createLinkList(int length) {
        Node head = new Node(1);
        Node cur = head;
        for(int i = 0; i < length - 1; i++) {
            cur.next = new Node(i+2);
            cur = cur.next;
        }
        return head;
    }

    public static void printList(Node head) {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.value + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    // 链表反转
    public static Node reverse(Node head) {
        Node pre = null;
        Node cur = head;
        while(cur != null) {
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node linkList = createLinkList(10);
        printList(linkList);
        printList(reverse(linkList));
    }

}
