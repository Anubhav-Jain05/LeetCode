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
    public ListNode sortList(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
      /*  ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null){
            if(slow.val > fast.val){
               
                slow.val=fast.val;
                fast.val=slow.val;
                //slow.next=fast;
                //slow.next=fast;
                //fast.next=slow;
            }else {
                slow=slow.next;
                fast=fast.next;
            }
        }
        return dummy.next;*/
        
        head.next=this.sortList(head.next);
        if(head.val<head.next.val){
            return head;
        }else{
            ListNode slow=head;
            while(slow.next!=null){
                if(slow.val > slow.next.val){
                    int temp=slow.val;
                    slow.val=slow.next.val;
                        slow.next.val=temp;
                    slow=slow.next;
                }else {
                    break;
                }
            }
        }
        return head;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}