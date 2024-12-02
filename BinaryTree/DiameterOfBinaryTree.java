package BinaryTree;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] dia = new int[1];
        diameterHelper(root,dia);
        return dia[0];
    }
    public int diameterHelper(TreeNode node,int[] dia){
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return 1;
        }
        int left = diameterHelper(node.left, dia);
        int right = diameterHelper(node.right, dia);

        dia[0] = Math.max(dia[0], left+right);
        return 1 + Math.max(left,right);
    }
}
