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
    public ListNode reverseList(ListNode head) {
      if(head==null || head.next==null)
      {
          return head;
      }
      //  ListNode temp=head.next;
      // ListNode ans=reverseList(head.next);
      // temp.next=head;
      // head.next=null;
      // return ans;
      ListNode dummy=null;
    ListNode next=head.next;

      while(head!=null)
      {
          next=head.next;
          head.next=dummy;
          dummy=head;
          head=next;
      }
        return dummy;

        
        
        
    }
}
