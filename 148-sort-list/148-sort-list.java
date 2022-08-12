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
       /* if(head==null ||head.next==null){
            return head;
        }
        if(head.val < head.next.val){
            return head;
        }
      /* ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null){
            if(slow.val > fast.val){
               
               int temp= slow.val;
                slow.val=fast.val;
                    fast.val=temp;
                //slow=slow.next;
            }else {
                slow=slow.next;
                //fast=fast.next;
            }
        }
        return dummy.next;*/
        
        
       /*ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=head;
        
        while(slow.next!=null){
            if(slow.val > slow.next.val){
                int temp=slow.val;
                slow.val=slow.next.val;
                slow.next.val=temp;
                slow=slow.next;
            }
            
            
        }
        return dummy.next;*/
        
       /* head.next=this.sortList(head.next);
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
        return head;*/
        
        if(head==null  || head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode slow=head;
        ListNode  fast=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        
        ListNode h1=sortList(head);
        ListNode h2=sortList(slow);
        return merge(h1,h2);
        
    }
    
    public ListNode merge(ListNode h1, ListNode h2){
        if(h1==null){
            return h2;
        }
        if(h2==null){
            return h1;
        }
        if(h1.val < h2.val){
          h1.next=merge(h1.next,h2);
            return h1;
        }
        else{
            h2.next=merge(h1,h2.next);
            return h2;
        }
    }
    
}