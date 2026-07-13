import javax.swing.tree.TreeNode;

    static class Solution {

    int cameras = 0;

    // 0 -> Node needs a camera
    // 1 -> Node has a camera
    // 2 -> Node is covered

    private int dfs(TreeNode root) {
        if (root == null) return 2;

        int left = dfs(root.left);
        int right = dfs(root.right);

        if (left == 0 || right == 0) {
            cameras++;
            return 1;
        }

        if (left == 1 || right == 1) {
            return 2;
        }

        return 0;
    }

    public int minCameraCover(TreeNode root) {
        if (dfs(root) == 0) {
            cameras++;
        }
        return cameras;
    }
}

