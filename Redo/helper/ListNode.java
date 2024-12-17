package Redo.helper;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toPrint(ListNode head){
        String s = "";
        ListNode node = head;
        while(node!=null){
            s+=node.val + " ";
            node = node.next;
        }
        return s;
    }
}
