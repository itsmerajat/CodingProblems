package LinkedList;

import java.util.List;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode tempLess = new ListNode(0);
        ListNode tempMore = new ListNode(0);
        ListNode node = head;
        ListNode less = tempLess;
        ListNode more = tempMore;
        while(node!=null){
            if(node.val>=x){
                more.next = node;
                more = more.next;
            }
            else{
                less.next = node;
                less = less.next;
            }
            node = node.next;
        }
        more.next = null;
        less.next = tempMore.next;
        return tempLess.next;
        
    }
}
