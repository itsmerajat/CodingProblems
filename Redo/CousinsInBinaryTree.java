package Redo;

import Redo.TreeNode;

public class CousinsInBinaryTree {

    public static boolean checkCousin(TreeNode node, int x, int y) {
        if (node == null) {
            return false;
        }
        if ((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x)) {
            return false;
        }
        int xpath = path(node, x);
        int ypath = path(node, y);
        return xpath==ypath;
    }

    public static int path(TreeNode node,int val){
        if(node==null){
            return -1;
        }
        int d = -1;
        if(node.val==val || (d=path(node.left,val))>=0 || (d=path(node.right,val))>=0)
            return d+1;
    
        return d;
    }
    public static void main(String[] args) {
        TreeNode myTree = new TreeNode(1);
        myTree.left = new TreeNode(2);
        myTree.right = new TreeNode(3);
        myTree.left.left = new TreeNode(4);
        TreeNode.TreePrinter(myTree);
        // System.out.print("paths are--> ");
        System.out.println(checkCousin(myTree,4,3));
    }
}