class Solution {
    int found;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode B, TreeNode C) {
        found = 0;
        TreeNode node = check(root, B, C);
        if(found == 2){
            return node;
        }
        else if(B==C && found==1)
            return node;
        return null;
    }

    private TreeNode check(TreeNode root, TreeNode B, TreeNode C) {
        if (root == null)
            return null;
        TreeNode l = check(root.left, B, C);
        TreeNode r = check(root.right, B, C);
        if (root == B || root == C) {
            found++;
            return root;
        }
        if (l != null && r != null)
            return root;
        if (l == null)
            return r;
        return l;
        
    }
}
