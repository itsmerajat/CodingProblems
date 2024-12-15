package LinkedList;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode node = temp;
        while(n>0){
            node = node.next;
            n-=1;
        }
        ListNode node2 = temp;
        while(node!=null){
            node = node.next;
            node2 = node2.next;
        }
        node2.next = node2.next.next;
        return temp.next;
        
    }
}
