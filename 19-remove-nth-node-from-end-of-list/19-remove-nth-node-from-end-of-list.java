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
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;
        
        if (head == null) {
            return null;
        }
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        len=len-n;
        int temp=0;
        while(cur.next!=null){
           if(temp==len)
                cur.next=cur.next.next;
            else
                cur=cur.next;
            temp++;
        }
        return dummy.next;
    }
}