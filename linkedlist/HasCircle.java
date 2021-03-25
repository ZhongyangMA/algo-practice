package linkedlist;

/**
 * @author Zhongyang MA
 * @date Mar/25/2021
 * @description 判断链表是否有环 快慢指针法
 */
public class HasCircle {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

}
