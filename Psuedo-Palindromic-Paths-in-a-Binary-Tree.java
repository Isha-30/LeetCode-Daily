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
    public int pseudoPalindromicPaths (TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int v) {
        if(root == null) 
            return 0;
     
        v^=1<<root.val;
        
        if(root.left==null && root.right==null) 
            return v == 0 || powerOf2(v) ? 1 : 0;
        
        return dfs(root.left, v) + dfs(root.right, v);
    }
    
    public boolean powerOf2(int v) {
        return (v&(v-1))==0;
    }
}
   
