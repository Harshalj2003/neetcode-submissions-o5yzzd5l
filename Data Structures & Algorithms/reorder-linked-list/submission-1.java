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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Push the second half of the list into a stack/deque
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode current = slow.next;
        slow.next = null; // Disconnect the first half from the second half

        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        // Step 3: Interleave the nodes from the first half and the stack
        ListNode firstHalf = head;
        while (!stack.isEmpty()) {
            ListNode nextFirst = firstHalf.next;
            ListNode lastNode = stack.pop();

            firstHalf.next = lastNode;
            lastNode.next = nextFirst;

            firstHalf = nextFirst;
        }
    }
}
