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
        
         ListNode dummy=new ListNode(-1);
    ListNode prev=dummy;
    ListNode slow=head;
    while(slow!=null) {
        prev=dummy;
        while(prev.next!=null&&prev.next.val<slow.val) {
            prev=prev.next;
        }
        ListNode next=slow.next;
        slow.next=prev.next;
        prev.next=slow;
        slow=next;
    }
    return dummy.next;
    }
}