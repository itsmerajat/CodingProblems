package LinkedList;

public class SortList {
    public static ListNode sortList(ListNode head) {
        return helper(head);
        
    }

    public static ListNode helper(ListNode node){
        if(node==null || node.next==null){
            return node;
        }
        ListNode left = node;
        ListNode temp = split(node);
        ListNode right = temp.next;
        temp.next = null;
        return mergeTwoLists(helper(left),helper(right));
    }



    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

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

    public static ListNode split(ListNode node){
        ListNode slow = node;
        ListNode fast = node;
        ListNode prev = slow;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        // ListNode node = head.next;
        // node.next = new ListNode(3);
        // node = node.next;
        // node.next = new ListNode(4);
        // node = node.next;
        // node.next = new ListNode(0);

        System.out.println(head.toPrint(head));
        ListNode newNode = sortList(head);
        System.out.println(newNode.toPrint(newNode));
    }

    public static void swap(ListNode node,ListNode prev) {
        // ListNode prev = node;
        ListNode next = node.next;
        ListNode temp = next.next;
        prev.next = next;
        next.next = node;
        node.next = temp;
    }
    
}