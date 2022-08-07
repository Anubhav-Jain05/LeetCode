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
    public ListNode swapPairs(ListNode head) {
       ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode point=dummy;
        while(point.next!=null && point.next.next!=null){
            ListNode first=point.next;
            ListNode second=point.next.next;
            point.next=second;
            first.next=second.next;
            second.next=first;
            point=first;
        }
        return dummy.next;
    }
}