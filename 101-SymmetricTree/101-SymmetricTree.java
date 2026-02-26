// Last updated: 2/26/2026, 9:55:00 AM
class Solution {
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left,root.right);
    }
}