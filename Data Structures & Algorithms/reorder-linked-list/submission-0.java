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
    public void reorderList(ListNode head) {
      ListNode curr = head;
        Stack<ListNode> st= new Stack<>();
        while(curr != null){
            st.push(curr);
            curr=curr.next;
        }
       curr= head;
       int size=st.size();
        for(int i=0;i<size/2;i++){
            ListNode last= st.pop();
            ListNode next=curr.next;
            curr.next=last;
            last.next=next;
            curr=next;
        }
        curr.next=null;
    }
}
