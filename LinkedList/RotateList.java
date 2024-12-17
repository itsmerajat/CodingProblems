package LinkedList;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int size = 0;
        ListNode node = head;
        ListNode lastNode = node;
        while(node!=null){
            lastNode = node;
            node=node.next;
            size+=1;
        }
        lastNode.next = head;
        k = k%size;
        int rotate = size-k;
        node = head;
        while(rotate>1){
            node = node.next;
            rotate-=1;
        }
        ListNode newHead = node.next;
        node.next = null;
        return newHead;
    }
}