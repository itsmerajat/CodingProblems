package Redo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import Redo.helper.ListNode;
import Redo.helper.ReverseLinkedList;

public class NextGreaterNode {
    public static int[] nextLargerNodes(ListNode head) {
        
        ListNode node = ReverseLinkedList.reverse(head);

        Stack<Integer> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        while(node!=null){
            if(stack.isEmpty()){
                stack.add(node.val);
                ans.add(0);
                node = node.next;
            }
            else if(stack.peek()>node.val){
                ans.add(stack.peek());
                stack.add(node.val);
                node = node.next;
                
            }
            else{
                stack.pop();
            }
        }
        ans = ans.reversed();
        return ans.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(7);
        ListNode node = head.next;
        node.next = new ListNode(5);
        node = node.next;
        node.next = new ListNode(1);
        node = node.next;
        node.next = new ListNode(9);
        node = node.next;
        node.next = new ListNode(2);
        node = node.next;
        node.next = new ListNode(5);
        node = node.next;
        node.next = new ListNode(1);

        System.out.println(head.toPrint(head));
        int[] ans = nextLargerNodes(head);
        System.out.println(Arrays.toString(ans));
    }
}


// 2 7 4 3 5

// 5 3 4 7 2

// stack = [5]

