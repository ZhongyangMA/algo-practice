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

    // 链表反转（全部）
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

    // 链表反转（局部）
    public static Node reverseBetween(Node head, int left, int right) {
        // 因为头节点有可能发生变化，使用虚拟头节点可以避免复杂的分类讨论
        Node dummyNode = new Node(-1);
        dummyNode.next = head;
        Node pre = dummyNode;

        // 第 1 步：从虚拟头节点走 left - 1 步，来到 left 节点的前一个节点
        for(int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        // 第 2 步：从 pre 再走 right - left + 1 步，来到 right 节点
        Node rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }

        // 第 3 步：切断出一个子链表（截取链表）
        Node leftNode = pre.next;
        Node curr = rightNode.next;
        // 切断链接
        pre.next = null;
        rightNode.next = null;

        // 第 4 步：反转子区间
        reverse(leftNode);
        // 第 5 步：接回到原来的链表中
        pre.next = rightNode;
        leftNode.next = curr;
        return dummyNode.next;
    }

    // 找出倒数第K个节点
    public static Node findKthToTail(Node head, int k) {
        //双指针法 p1跑k-1步时 放出p2 p1跑到底时p2指向倒数第k个节点
        Node p1 = head;
        Node p2 = head;
        int count = 1;
        while(p1.next != null) {
            p1 = p1.next;
            count++;
            if(count > k) {
                p2 = p2.next;
            }
        }
        return p2;
    }

    public static void main(String[] args) {
        Node linkList = createLinkList(10);
        printList(linkList);
        Node reversed = reverse(linkList);
        printList(reversed);
        Node asc = reverse(reversed);
        printList(asc);

        Node list = reverseBetween(asc, 4, 6);
        printList(list);

        // 找出倒数第k个元素
        Node node = findKthToTail(linkList, 3);
        System.out.println(node.value);
    }

}
