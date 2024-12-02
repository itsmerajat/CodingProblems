package BinaryTree;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return balanceHelper(root)!=-1;
    }
    public int balanceHelper(TreeNode node){
        if(node==null){
            return 0;
        }
        int left = balanceHelper(node.left);
        int right = balanceHelper(node.right);
        if(left==-1) return -1;
        if(right==-1) return -1;
        if(Math.abs(left-right)>1){
            return -1;
        }
        return 1 + Math.max(left,right);
    }
}