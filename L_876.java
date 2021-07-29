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
    public ListNode middleNode(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        while(slow!=null && slow.next!=null){
            slow=slow.next.next;
            fast=fast.next;
        }
        return fast;
        
    }
}