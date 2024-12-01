package LinkedList;

import javax.swing.border.LineBorder;

public class RemoveElementFromLinkedList {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode tempNode = new ListNode(-1);
        tempNode.next = head;
        ListNode node = tempNode;
        while (node != null && node.next != null) {
            if (node.next.val == val)
                node.next = node.next.next;
            else
                node = node.next;
        }
        return tempNode.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        ListNode node = head.next;
        node.next = new ListNode(2);
        node = node.next;
        node.next = new ListNode(3);
        node = node.next;
        node.next = new ListNode(3);
        // node = node.next;
        // node.next = new ListNode(5);
        // node = node.next;
        // node.next = new ListNode(6);

        System.out.println(head.toPrint(head));
        head = removeElements(head, 7);
        if(head==null)
            System.out.println("Nothing to print");
        else
            System.out.println(head.toPrint(head));

    }
}