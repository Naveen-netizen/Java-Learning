package mar28;
public class Solution {
    public int lengthOfTheCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
            }
        }
        return length;
    }
    
    private class ListNode{
        int val;
        ListNode next;
        private ListNode(int val){
            this.val=val;
        }
    }
}
