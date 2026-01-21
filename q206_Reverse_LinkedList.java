class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode curr=head,prev=null,nextn=head.next;
        while(nextn!=null){
            curr.next=prev;
            prev=curr;
            curr=nextn;
            nextn=nextn.next;
        }
        curr.next = prev;
        return curr;
    }
}
