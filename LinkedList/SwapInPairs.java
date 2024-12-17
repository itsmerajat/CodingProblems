package LinkedList;

public class SwapInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        ListNode prev = node;
        if(node==null || node.next==null){
            return node;
        }
        head = node.next;
        while(node!=null && node.next!=null){
            ListNode next = node.next;
            ListNode temp = next.next;
            next.next = node;
            prev.next = next;
            node.next = temp;
            prev = node;
            node = node.next;
        }
        return head;
    }


    
}