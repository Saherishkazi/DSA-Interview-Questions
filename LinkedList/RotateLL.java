/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        //base case
                if (head == null || head.next == null || k == 0) return head;

        // 1) find tail and length
        ListNode tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        // 2) make it circular
        tail.next = head;

        // 3) normalize k
        k = k % len;
        if (k == 0) {        // NO rotation needed -> break circle and return original
            tail.next = null;
            return head;
        }

        // 4) find new tail: (len - k)-th node
        int stepsToNewTail = len - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // 5) set new head and break circle
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;

    }
}
