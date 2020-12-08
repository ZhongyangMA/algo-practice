package tree;

import java.util.*;

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
    // 1.先将根节点入队
    // 2.while(将其出队并打印，若其左子节点不为空将左子入队，若其右子不为空将右子入队)
    public static void levelOrder(TreeNode root){
        if(root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode current = null;
        //1.根节点入队
        queue.offer(root);
        while (!queue.isEmpty()) {
            //2.出队并打印
            current = queue.poll();
            System.out.println(current.value);
            // 若其左子节点不为空 将左子入队
            if(current.left != null) {
                queue.offer(current.left);
            }
            // 若其右子节点不为空 将右子入队
            if(current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    // 锯齿形(之字形)层次遍历
    public static void zigzagLevelOrder(TreeNode root) {
        if(root == null) return;

        List res = new ArrayList(); // 最终返回结果
        Queue<TreeNode> queue = new LinkedList<>();  //辅助队列
        TreeNode current = null;  // 记录出队节点

        boolean direction = true;  // 每层是正序还是逆序
        //1.根节点入队
        queue.offer(root);
        // while循环 每次只扫描一层
        while (!queue.isEmpty()) {

            // 记录当前层的尺寸
            int levelSize = queue.size();
            // 存储当前层的元素
            List levelList = new ArrayList();
            // 扫描当前层
            for(int i = 0; i < levelSize; i++) {
                // 出队并打印
                current = queue.poll();
                levelList.add(current.value);
                // 若其左子节点不为空 将左子入队
                if(current.left != null) {
                    queue.offer(current.left);
                }
                // 若其右子节点不为空 将右子入队
                if(current.right != null) {
                    queue.offer(current.right);
                }
            }

            // 决定正序还是逆序保存
            if(direction) {
                res.add(levelList);
            } else {
                Collections.reverse(levelList);
                res.add(levelList);
            }
            direction = !direction;  // 改变方向
        }
        System.out.println(res.toString());
    }

    // 倒序层次遍历

    // 二叉树深度
    public static int depth(TreeNode root) {
        if(root == null) return 0;

        int left = depth(root.left);
        int right = depth(root.right);
        return (left > right ? left : right) + 1;
    }

    // 二叉树节点数
    public static int countNode(TreeNode root) {
        if(root == null) return 0;
        int left = countNode(root.left);
        int right = countNode(root.right);
        return 1 + left + right;
    }

    public static void main(String[] args) {
        TreeNode tree = createTree();
        // 先序遍历 递归法
        System.out.println("先序遍历 递归法");
        preOrder1(tree);
        // 先序遍历 压栈法
        System.out.println("先序遍历 压栈法");
        preOrder2(tree);
        // 层次遍历 队列法
        System.out.println("层次遍历 队列法");
        levelOrder(tree);
        // 锯齿形层次遍历
        System.out.println("锯齿形层次遍历");
        zigzagLevelOrder(tree);
        // 二叉树深度
        System.out.println("二叉树深度:" + depth(tree));
        // 二叉树节点数
        System.out.println("二叉树节点数:" + countNode(tree));

    }
}
