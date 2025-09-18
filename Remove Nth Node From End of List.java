/*Remove Nth Node From End of List
https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
*/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if (count==n){
            head=head.next;
        }else{
       
        int r=0;
        ListNode temp1=head;
        while(r<count-n-1){
            temp1=temp1.next;r++;
        }
        temp1.next=temp1.next.next;}
        return head;


        
    }
}
