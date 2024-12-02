package BinaryTree;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        return helper(root);
    }
    public TreeNode helper(TreeNode node){
        if(node==null){
            return null;
        }
        TreeNode left = helper(node.left);
        TreeNode right = helper(node.right);

        // TreeNode temp = left;
        node.left = right;
        node.right = left;
        return node;
    }
}