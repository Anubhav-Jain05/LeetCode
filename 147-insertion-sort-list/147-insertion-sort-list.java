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
    public ListNode insertionSortList(ListNode head) {
       /* if(head==null || head.next==null){
            return head;
        }
        
        
        head.next=this.insertionSortList(head.next);
        if(head.val <= head.next.val){
                 return head;
        }
        else{
            ListNode slow=head;
            while(slow.next!=null){
            
             if (slow.val > slow.next.val){
                int temp= slow.val;
                slow.val=slow.next.val;
                slow.next.val=temp;
                slow=slow.next;
                
            }
            else{
                break;
            }
        }
        }
        return head;*/
        
         ListNode helper=new ListNode(0);
    ListNode pre=helper;
    ListNode current=head;
    while(current!=null) {
        pre=helper;
        while(pre.next!=null&&pre.next.val<current.val) {
            pre=pre.next;
        }
        ListNode next=current.next;
        current.next=pre.next;
        pre.next=current;
        current=next;
    }
    return helper.next;
    }
}