package BinaryTree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        return isSame(left,right);
            }
        
        private boolean isSame(TreeNode left, TreeNode right) {
            if(left==null && right==null)
                return true;
            if(left==null && right!=null)
                return false;
            if(right!=null && left==null)
                return false;
            if(left.val!=right.val)
                return false;
            return isSame(left.left, right.right) && isSame(left.right, right.left);
        }
}