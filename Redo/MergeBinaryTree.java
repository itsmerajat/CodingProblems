package Redo;

import Redo.helper.TreeNode;

public class MergeBinaryTree {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return mergeHelper(root1, root2);
    }

    public TreeNode mergeHelper(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return null;
        }
        if(node1==null){
            return node2;
        }
        if(node2==null){
            return node1;
        }
        TreeNode ans = new TreeNode(node1.val + node2.val);
        ans.left = mergeHelper(node1.left, node2.left);
        ans.right = mergeHelper(node1.right, node2.right);
        return ans;

    }
}