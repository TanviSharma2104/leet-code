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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        int sum=0;
        int carry=0;
        ListNode head=new ListNode();
        while(!s1.isEmpty() || !s2.isEmpty()){
            sum=carry;
            if(!s1.isEmpty()){
            sum+=s1.pop();
            }
            if(!s2.isEmpty()){
                sum+=s2.pop();
            }
            head.val=sum%10;
            ListNode temp=new ListNode(sum/10);
            temp.next=head;
            head=temp;
            carry=sum/10;

        }
        if(head.val!=0){
            return head;
        }
        return head.next;
    }
}
