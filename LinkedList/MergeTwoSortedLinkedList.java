package LinkedList;

public class MergeTwoSortedLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ans = new ListNode();
        ListNode ansNode = ans;

        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        ListNode node1 = list1;
        ListNode node2 = list2;

        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                ans.next = node1;
                node1 = node1.next;
            } else {
                ans.next = node2;
                node2 = node2.next;
            }
            ans = ans.next;
        }
        while (node1 != null) {
            ans.next = node1;
            node1 = node1.next;
            ans = ans.next;
        }
        while (node2 != null) {
            ans.next = node2;
            node2 = node2.next;
            ans = ans.next;
        }
        return ansNode.next;

    }
}