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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head ; 
        int n =1 ; //initially take no of node 1 
        ListNode last = head; 
        while(last.next!=null){ 
            n++; 
            last = last . next ; 
        } // after lopp we got number of node and last node address 
        k =k%n ; 
        if(k==0)return head ; 
        int count = 1; 
        ListNode t = head ; 
        while(t!=null){ 
            if(count ==(n-k)) break ; //to reach n-k node 
            count++; 
            t=t.next ; 
        }//here we fount t that is n-k 
        last . next = head ; 
        ListNode res = t . next ; 
        t.next = null ; 
        return res ;
    }
}