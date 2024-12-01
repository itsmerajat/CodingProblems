package LinkedList;

public class RemoveDuplicatesFromSortedLinkedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;

        if(node==null || node.next==null){
            return node;
        }
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }

        return head;
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

        System.out.println(head.toPrint(head));
        head = deleteDuplicates(head);
        if(head==null)
            System.out.println("Nothing to print");
        else
            System.out.println(head.toPrint(head));

    }
}