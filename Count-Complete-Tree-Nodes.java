/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int l = leftHeight(root.left);
        int r = leftHeight(root.right);
        
        if(l==r)
            return countNodes(root.right) + (1<<l);
        
        return countNodes(root.left) + (1<<r);
    }
    
    private int leftHeight(TreeNode root){
        int h = 0;
        while(root!=null){
            h++;
            root = root.left;
        }
        return h;
    }
}
