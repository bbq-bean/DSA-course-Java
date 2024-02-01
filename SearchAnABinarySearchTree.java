class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // this gotta be recursive

        // no more nodes, and val wasnt found
        if (root == null){
            return null;
        }

        // continue through left side
        if (val < root.val) {
            return searchBST(root.left, val);
        
        // continue through right
        } else if  (val > root.val) {
            return searchBST(root.right, val);
        
        // we found the val
        } else {
            return root;
        }
        
    }
}
