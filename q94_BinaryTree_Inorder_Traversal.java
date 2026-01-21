class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(TreeNode root, List<Integer> result) {
        if (root == null) return;        // Base case

        inorderHelper(root.left, result);   // LEFT
        result.add(root.val);               // ROOT
        inorderHelper(root.right, result);  // RIGHT
    }
}
