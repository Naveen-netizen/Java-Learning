package LinkedList.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        
    }
    public ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return Merge(left,right);
    }

    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null)
            current.next = list1;
        if (list2 != null)
            current.next = list2;
        return dummy.next;
    }
    public ListNode getMid(ListNode head) {
        if (head == null) return null; // Edge case: empty list

        ListNode slow = head;
        ListNode fast = head;

        // Move `slow` by one step and `fast` by two steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Middle node
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
