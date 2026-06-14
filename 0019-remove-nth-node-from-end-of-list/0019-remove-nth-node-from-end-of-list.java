class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Dummy node
        ListNode dummy =
            new ListNode(0);

        dummy.next = head;

        // Two pointers
        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast n+1 steps
        for (int i = 0;
             i <= n;
             i++) {

            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {

            slow = slow.next;
            fast = fast.next;
        }

        // Remove target node
        slow.next =
            slow.next.next;

        return dummy.next;
    }
}