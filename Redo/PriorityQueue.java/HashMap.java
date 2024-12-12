package HashMap;

import java.util.LinkedList;
public class HashMap {
    public static class ListNode {
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
    }

    int size;
    ListNode[] arr;

    HashMap(){
        this.size = 16;
        this.arr = new ListNode[size];
    }   

    public int hash(int key){
        return key%this.size;
    }

    public int get(int key){
        ListNode head = this.arr[hash(key)];

        ListNode node = head;
        while(node!=null){
            if(node.key==key){
                return node.val;
            }
            node = node.next;
        }
        return -1;
    }

    public void put(int key,int val){
        ListNode head = this.arr[hash(key)];
        ListNode newNode = new ListNode(key,val);
        newNode.next = head;
        this.arr[hash(key)] = newNode;
    }


    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(5,1);
        map.put(85,2);
        map.put(37,3);
        System.out.println(map.get(24));
        map.put(21,4);
        System.out.println(map.get(5));
        System.out.println(map.get(85));
        System.out.println(map.get(37));
    }
}



