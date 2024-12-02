package BinaryTree;

import java.util.ArrayList;

public class SubtreeofAnotherTree {
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return traversalHelper(root, subRoot);
    }

    public static boolean traversalHelper(TreeNode node, TreeNode subRoot) {
        if (node == null) {
            return false;
        }
        return isSame(node, subRoot) || traversalHelper(node.left, subRoot) || traversalHelper(node.right, subRoot);
    }

    private static boolean isSame(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;
        if (node1 == null && node2 != null)
            return false;
        if (node1 != null && node2 == null)
            return false;
        if(node1.val!=node2.val)
            return false;
        return isSame(node1.left, node2.left) && isSame(node1.right, node2.right);
    }
    public static void main(String[] args) {
        TreeNode Tree1 = new TreeNode(1);
        Tree1.left = new TreeNode(1);
        TreeNode Tree2 = new TreeNode(1);
        System.out.println(isSubtree(Tree1,Tree2));
    }
}