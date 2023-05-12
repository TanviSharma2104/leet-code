/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> s1=new Stack<>();
        Stack<ListNode> s2=new Stack<>();
        while(headA!=null){
            s1.push(headA);
            headA=headA.next;
        }
        while(headB!=null){
            s2.push(headB);
            headB=headB.next;
        }
        ListNode temp=null;
        // ListNode a=s1.peek();
        // ListNode b=s1.peek();
        if(!s1.peek().equals(s2.peek())){
            return null;
        }
        while(!s1.empty() && !s2.empty() && s1.peek().equals(s2.peek())){
            temp=s1.pop();
            s2.pop();
        }
        return temp;
    }
}
