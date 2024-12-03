package BinaryTree;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return sumHelper(root, 0, targetSum);
    }

    public boolean sumHelper(TreeNode node, int currsum, int targetSum) {
        if (node == null) 
            return false;
        currsum += node.val;
        if(node.left==null && node.right==null){
            return currsum==targetSum;
        }
        return sumHelper(node.left, currsum, targetSum) || sumHelper(node.right, currsum, targetSum);
    }
}
