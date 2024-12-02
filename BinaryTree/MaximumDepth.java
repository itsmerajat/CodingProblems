package BinaryTree;

public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        return depthHelper(root);
    }
    public int depthHelper(TreeNode node){
            if(node==null){
                return 0;
            }
            if(node.left==null && node.right==null){
                return 1;
            }
            return 1 + Math.max(depthHelper(node.left),depthHelper(node.right));
        }
}