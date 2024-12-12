package HashMap;

public class ListNode {
    int key;
    int val;;
    ListNode next;

    ListNode() {
    }

    ListNode(int key) {
        this.key = key;
    }

    ListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }

    public String toPrint(ListNode head){
        String s = "";
        ListNode node = head;
        while(node!=null){
            s+=node.key + " ";
            node = node.next;
        }
        return s;
    }
}
