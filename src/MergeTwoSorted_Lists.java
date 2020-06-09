public class MergeTwoSorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        while (l1 != null && l2 != null) {
            if (l2.val >= l1.val) {
                ans.next = new ListNode(l1.val);
                l2 = l2.next;
            } else {
                ans.next = new ListNode(l2.val);
                l1 = l1.next;
            }
        }
        return ans.next;

    }

    public static void main(String[] args) {
        ListNode one= new ListNode(1);
        one.next  = new ListNode(1);

    }
}

