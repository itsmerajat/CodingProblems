package LinkedList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = carry + l1.val + l2.val; //7
        ListNode head;
        if(sum>9){
            carry = 1;
            sum = sum-10;
        }
        l1 = l1.next;
        l2 = l2.next;
        head = new ListNode(sum); //head = Node(7) 
        ListNode node = head; // node=Node(7)
        while(l1!=null || l2!=null){
            sum = carry;
            if(l1!=null){
                sum +=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum +=l2.val;
                l2 = l2.next;
            }
            if(sum>9){
                carry = 1;
                sum = sum-10;
            }
            else{
                carry=0;
            }
            node.next = new ListNode(sum);
            node = node.next;
        }
        if(carry==1){
            node.next = new ListNode(1);
        }
        return head;

    }
}