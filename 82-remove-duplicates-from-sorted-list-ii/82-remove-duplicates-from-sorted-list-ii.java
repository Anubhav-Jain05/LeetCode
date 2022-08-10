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
    public ListNode deleteDuplicates(ListNode head) {
       /* ListNode temp=head;
        while(temp!=null){
            if(temp.next==null){
                break;
            }
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;*/
       /* ListNode slow=head;
      //  ListNode fast=head.next;
        //ListNode prev=null;
        while(slow!=null){
            if(slow.next==null){
                break;
            }
            //slow=slow.next;
            //fast=fast.next;
            if(slow.val==slow.next.val){
                //slow.next=fast.next;
                //fast.next=fast.next.next;
                slow.next=slow.next.next;
            }else{
                slow=slow.next;
                //fast=fast.next;
            }
            
        }
        return head;*/
        
        ListNode dummy = new ListNode(0);
        ListNode slow=dummy;
        ListNode fast=head;
        slow.next=fast;
        while(fast!=null){
            while(fast.next!=null && fast.val==fast.next.val){
            fast=fast.next;
        }
            if(slow.next!=fast){
               slow.next=fast.next;
                fast=slow.next;
            }else{
                slow=slow.next;
                fast=fast.next;
            }
        }
        return dummy.next;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}