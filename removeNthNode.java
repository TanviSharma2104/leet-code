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
        if(head.next==null){
            return null;
        }
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        int indexToSearch=size-n;
        ListNode prev=head;
        int i=1;
        while(i<indexToSearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
        
        
        //or using 2 pointers
        ListNode temp=new ListNode();
        temp.next=head;
        ListNode a=temp;
        ListNode b=temp;
        for(int i=1;i<=n+1;i++){
            a=a.next;
        }
        while(a!=null){

            a=a.next;
            b=b.next;
        }
        b.next=b.next.next;
        return temp.next;
        
    }
}
