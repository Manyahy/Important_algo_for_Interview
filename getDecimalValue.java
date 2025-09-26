//1290
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
        ListNode temp=head;
        int num=0;
        ListNode t=head;
        int count=0;
        while(t!=null){
            count++;
            t=t.next;
        }
        count=count-1;
        while(temp!=null){
            num=num+(int)(temp.val*(Math.pow(2,count)));
            count--;
            temp=temp.next;
        }
        return num;
    }
}
