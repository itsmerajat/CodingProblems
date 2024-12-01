package LinkedList;

public class ReverseLinkedList {

    public static ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
    
}
