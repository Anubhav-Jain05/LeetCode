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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        /*f(head==null || head.next==null){
            return head;
        }
        ListNode res= new ListNode(0);
        ListNode slow=head;
        ListNode fast=head;
        while(res!=null && res.next!=null){
            if(left <= right){
                int temp=left;
                left=right;
                right=temp;
            }
            res=res.next;
        }
        return res;*/
        if (head==null){
            return null;
        }
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        ListNode slow=prev.next;
        ListNode fast=slow.next;
        for(int i=0;i<right-left;i++){
             slow.next = fast.next;
        fast.next = prev.next;
        prev.next = fast;
        fast = slow.next;
        }
        return dummy.next;
        
    }
}