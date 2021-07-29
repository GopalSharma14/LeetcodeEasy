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
    public int getDecimalValue(ListNode head) {
         ListNode current = head;
        int output=0;
        while(current!=null){
            output=(2*output)+current.val;
            current=current.next;
        }
        return output;
        
    }
}