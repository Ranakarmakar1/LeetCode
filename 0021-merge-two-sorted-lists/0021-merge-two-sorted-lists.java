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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
    
        ListNode ptr1 = head1;
        ListNode ptr2= head2;
        
        ListNode dummy = new ListNode(-1);
        ListNode newNode =dummy;
        
        while(ptr1 != null && ptr2 !=null){
            if(ptr1.val<ptr2.val){
                newNode.next=ptr1;
                ptr1=ptr1.next;
                newNode=newNode.next;
            }
            else{
                newNode.next=ptr2;
                ptr2=ptr2.next;
                newNode=newNode.next;
            }
        }
        if(ptr1==null) newNode.next=ptr2;
        if(ptr2==null) newNode.next=ptr1;
        
        return dummy.next;
    }
}