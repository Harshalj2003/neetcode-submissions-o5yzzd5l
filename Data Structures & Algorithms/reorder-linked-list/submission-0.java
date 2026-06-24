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

        // Step 1: Store all nodes in a list for easy index access
        List<ListNode> nodes = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            nodes.add(current);
            current = current.next;
        }

        // Step 2: Use two pointers to rearrange the links
        int left = 0;
        int right = nodes.size() - 1;

        while (left < right) {
            // Link left node to right node
            nodes.get(left).next = nodes.get(right);
            left++;

            // If pointers met, stop to avoid forming a cycle
            if (left == right) {
                break;
            }

            // Link right node to the next left node
            nodes.get(right).next = nodes.get(left);
            right--;
        }

        // Step 3: Set the next of the last node to null to prevent cycles
        nodes.get(left).next = null;



    }
}
