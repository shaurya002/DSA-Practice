/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        ListNode sFinal = head;
        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
            if(s==f){
                while(s!=sFinal){
                    s = s.next;
                    sFinal = sFinal.next;
                }
                return sFinal;
            }
        }
        return null;
    }
}