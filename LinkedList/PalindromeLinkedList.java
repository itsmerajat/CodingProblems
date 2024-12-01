package LinkedList;

import LinkedList.ReverseLinkedList;

public class PalindromeLinkedList {
    ListNode curr;

    // Using recursion
    public boolean isPalindrome(ListNode head) {
        curr = head;
        return palindromHelper(head);
    }

    public boolean palindromHelper(ListNode node) {

        if (node == null)
            return true;

        boolean res = palindromHelper(node.next) && node.val == curr.val;
        curr = curr.next;

        return res;
    }

    // Using two pointers
    public boolean checkPalindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode pointer1 = head;
        ListNode pointer2 = ReverseLinkedList.reverse(slow);

        while(pointer2!=null){
            if(pointer1.val!=pointer2.val){
                return false;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        
        return true;

    }
}
