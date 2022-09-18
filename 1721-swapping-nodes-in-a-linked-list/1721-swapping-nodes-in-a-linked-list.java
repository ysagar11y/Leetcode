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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode s=dummy,f=dummy,t=dummy;
        for(int i=0;i<k;i++){
            f=f.next;
            t=t.next;
        }
        while(f!=null){
            s=s.next;
            f=f.next;
        }
        int temp=t.val;
        t.val=s.val;
        s.val=temp;
        
        return dummy.next;
    }
}