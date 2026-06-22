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
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        
        ListNode curr = head;
        ListNode nxt = head.next;

        while(nxt != null && nxt.next != null){
            if(curr == nxt.next) return true;

            curr = curr.next;
            nxt = nxt.next.next;
        }

        return false;
    }
}
