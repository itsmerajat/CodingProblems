package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class Traversal {

    public static ArrayList<Integer> inOrderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrderTraversalHelper(root, list);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        return list;
    }

    public static void inOrderTraversalHelper(TreeNode node, ArrayList<Integer> arr) {
        if (node == null) {
            return;
        }
        inOrderTraversalHelper(node.left, arr);
        arr.add(node.val);
        inOrderTraversalHelper(node.right, arr);
    }

    public static ArrayList<Integer> preOrderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preOrderTraversalHelper(root, list);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        return list;
    }

    public static void preOrderTraversalHelper(TreeNode node, ArrayList<Integer> arr) {
        if (node == null) {
            return;
        }
        arr.add(node.val);
        preOrderTraversalHelper(node.left, arr);
        preOrderTraversalHelper(node.right, arr);
    }

    public static ArrayList<Integer> postOrderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        postOrderTraversalHelper(root, list);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        return list;
    }

    public static void postOrderTraversalHelper(TreeNode node, ArrayList<Integer> arr) {
        if (node == null) {
            return;
        }
        postOrderTraversalHelper(node.left, arr);
        postOrderTraversalHelper(node.right, arr);
        arr.add(node.val);
    }

    public static ArrayList<Integer> levelOrderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        Deque<TreeNode> q = new ArrayDeque<>();

        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.pollFirst();
            list.add(node.val);
            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        return list;
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

        System.out.print("Inorder Traversal --> ");
        inOrderTraversal(myTree);
        System.out.println("");
        System.out.print("Preorder Traversal --> ");
        preOrderTraversal(myTree);
        System.out.println("");
        System.out.print("Postorder Traversal --> ");
        postOrderTraversal(myTree);
        System.out.println("");
        System.out.print("Level order Traversal --> ");
        levelOrderTraversal(myTree);
    }

}
