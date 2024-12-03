package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreePath {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<String>();
        Helper(root,ans,"");
        return ans;
    }

    public static void Helper(TreeNode node, List<String> ans, String path ) {

        if (node == null) {
            return;
        }
        path += "->" + node.val;
        if(node.left==null && node.right==null)
            ans.add(path.substring(2, path.length()));
        else{
        Helper(node.left, ans, path);
        Helper(node.right, ans, path);
        }
        path = path.substring(0, path.length()-3);
        return;
    }
    public static void main(String[] args) {
        TreeNode myTree = new TreeNode(1);
        myTree.left = new TreeNode(2);
        myTree.right = new TreeNode(3);
        myTree.left.left = new TreeNode(4);
        myTree.left.right = new TreeNode(5);
        myTree.right.left = new TreeNode(6);
        myTree.right.right = new TreeNode(7);
        TreeNode.TreePrinter(myTree);
        System.out.print("paths are--> ");
        binaryTreePaths(myTree);
    }
}
