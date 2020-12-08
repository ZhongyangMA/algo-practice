package tree;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/08/2020
 */
public class BinaryTree {

    public static class TreeNode {
        public TreeNode(String value) {this.value = value;};
        private String value;
        private TreeNode left;
        private TreeNode right;
    }

    public static TreeNode createTree() {
        TreeNode root = new TreeNode("a");
        root.left = new TreeNode("b");
        root.right = new TreeNode("c");
        root.left.left = new TreeNode("d");
        root.left.right = new TreeNode("e");
        root.right.left = new TreeNode("f");
        root.right.right = new TreeNode("g");
        return root;
    }

    // 先序遍历 递归法
    public static void preOrder1(TreeNode root) {
        if(root == null) return;
        System.out.println(root.value);
        preOrder1(root.left);
        preOrder1(root.right);
    }

    // 先序遍历 压栈法
    // 1. 压根入栈
    // 2. while(出栈打印、塞右子、左子)
    public static void preOrder2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        //先把根节点压入栈
        stack.push(root);

        while (!stack.isEmpty()) {
            // 出栈并打印值
            TreeNode node = stack.pop();
            System.out.println(node.value);

            // 如果右子不为空 就把右子压入
            if(node.right != null) stack.push(node.right);

            // 如果左子不为空 就把左子压入
            if(node.left != null) stack.push(node.left);
        }
    }

    // 层次遍历
    public static void levelOrder(TreeNode root){}

    // 锯齿形(之字形)层次遍历
    public static void zigzagLevelOrder(TreeNode root) {}

    // 倒序层次遍历

    // 二叉树深度

    // 二叉树节点数

    public static void main(String[] args) {
        TreeNode tree = createTree();
        // 先序遍历 递归法
        System.out.println("先序遍历 递归法");
        preOrder1(tree);
        // 先序遍历 压栈法
        System.out.println("先序遍历 压栈法");
        preOrder2(tree);
    }
}
