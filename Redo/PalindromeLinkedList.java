package Redo;

import Redo.ListNode;

public class PalindromeLinkedList{
    ListNode curr;
    public boolean isPalindrome(ListNode head) {
        curr = head;
        return solve(head);
    }

    public boolean solve(ListNode head) {
        if(head == null) return true;
        boolean ans = solve(head.next) && head.val == curr.val;
        curr = curr.next;
        return ans;
    }
}



// Correct solution in O(1) and O(1) time and space complexity

class Solution {
public ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while(curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

public boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast = head.next;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode rev = reverse(slow.next); // reverse second list
    slow.next = null;
    while(rev != null) {
        if(head.val != rev.val) {
            return false;
        }
        head = head.next;
        rev = rev.next;
    }
    return true;
}
}
