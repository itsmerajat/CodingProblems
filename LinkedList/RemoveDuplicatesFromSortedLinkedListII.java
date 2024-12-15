package LinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromSortedLinkedListII {
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode li=new ListNode(0);
        ListNode curr=li;
        int prev=-101;
        while(head != null){
            if(head.next != null && (head.val == head.next.val || head.val== prev)){
                prev=head.val;
            }
            else if(head.val != prev){
                curr.next=new ListNode(head.val);
                curr=curr.next;
            }
            head=head.next;
        }
        return li.next;

        // if(head==null || head.next==null){
        //     return head;
        // }
        // ListNode temp = new ListNode(-150);
        // temp.next = head;
        // ListNode node = temp;
        
        // while (node.next.next != null) {
        //     if (node.next.val == node.next.next.val) {
        //         int tempNodeVal = node.next.val;
        //         ListNode tempNode = node;
        //         while(node.next!=null && node.next.val == tempNodeVal){
        //             node = node.next;
        //         }
        //         tempNode.next = node.next;
        //         // node.next = node.next.next;
        //     } else {
        //         node = node.next;
        //     }
        // }
        // return temp.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode node = head.next;
        node.next = new ListNode(2);
        node = node.next;
        node.next = new ListNode(3);
        node = node.next;
        node.next = new ListNode(3);
        node = node.next;
        node.next = new ListNode(4);

        System.out.println(head.toPrint(head));
        ListNode newNode = deleteDuplicates(head);
        System.out.println(newNode.toPrint(newNode));

    }
}