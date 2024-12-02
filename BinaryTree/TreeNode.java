package BinaryTree;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public static int height(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int getcol(int h) {
        if (h == 1)
            return 1;
        return getcol(h - 1) + getcol(h - 1) + 1;
    }

    public static void printTree(int[][] M, TreeNode root, int col, int row, int height) {
        if (root == null)
            return;
        M[row][col] = root.val;
        printTree(M, root.left, col - (int) Math.pow(2, height - 2), row + 1, height - 1);
        printTree(M, root.right, col + (int) Math.pow(2, height - 2), row + 1, height - 1);
    }

    public static void TreePrinter(TreeNode tree) {
        int h = height(tree);
        int col = getcol(h);
        int[][] M = new int[h][col];
        printTree(M, tree, col / 2, 0, h);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < col; j++) {
                if (M[i][j] == 0)
                    System.out.print("  ");
                else
                    System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

}
