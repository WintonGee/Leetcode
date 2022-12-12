package top_interview_questions;

public class Q104_MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return getDepth(root, 0);
    }

    public int getDepth(TreeNode node, int currentDepth) {
        if (node == null)
            return currentDepth;

        TreeNode leftNode = node.left, rightNode = node.right;

        int leftDepth = getDepth(leftNode, currentDepth);
        int rightDepth = getDepth(rightNode, currentDepth);

        return Math.max(leftDepth, rightDepth) + 1;
    }

}
