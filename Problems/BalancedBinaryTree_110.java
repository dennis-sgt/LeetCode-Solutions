public class BalancedBinaryTree_110 {
    boolean output = true;

    public boolean isBalanced(TreeNode root) {
        height(root);
        return output;
    }

    public int height(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        if(Math.abs(left - right) > 1) {
            output = false;
        }

        return 1 + Math.max(left, right);
    }
}
