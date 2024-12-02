package LinkedList;

public class IntersactionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = 0;
        int size2 = 0;
        ListNode node1 = headA;
        ListNode node2 = headB;
        while(node1!=null){
            node1 = node1.next;
            size1+=1;
        }
        while(node2!=null){
            node2 = node2.next;
            size2+=1;
        }
        node1 = headA;
        node2 = headB;
        if(size1>size2){
            while(size2!=size1){
                node1 = node1.next;
                size2+=1;
            }
        }
        else{
            while(size1!=size2){
                node2 = node2.next;
                size1+=1;
            } 
        }
        ListNode ans = null;
        while(node1!=null && node2!=null){
            if(node1==node2){
                return node1;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return ans;
        
    }
}