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
       ListNode curr= head;
       Stack<ListNode> st= new Stack<>();
       while(curr != null){
           st.push(curr);
           curr=curr.next;
       }
       ListNode prev=null;
      for(int i=1;i<=n;i++){
          curr = st.pop();
          if(!st.isEmpty()){
              prev=st.peek();
          }
          else{
              head=curr.next;
          }
      }
      if(prev != null)
        prev.next=curr.next;

       return head;
    }
}
