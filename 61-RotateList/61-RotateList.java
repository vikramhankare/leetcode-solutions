// Last updated: 6/7/2026, 6:31:19 PM
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
        ListNode temp = head;
        int n = 0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }

        if(n <= 1)
            return head;
        k = k%n;

        int diff = n-k;
        int diff2 = n-k-1;
        ListNode tailJoining = head;
        ListNode tail = head;
        ListNode newTail = head;

        while(diff>0){
            head = head.next;
            tail = tail.next;
            diff--;
        }

        while(diff2>0){
            newTail = newTail.next;
            diff2--;
        }

        while(tail!=null && tail.next!=null){
            tail = tail.next;
        }

        newTail.next = null;

        if(tail != null)
            tail.next = tailJoining;
        else
            return tailJoining;

        return head;

    }
}