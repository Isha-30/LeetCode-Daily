class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) 
            return "";
        
        String result = root.val + "";
        
        String left = tree2str(root.left);
        String right = tree2str(root.right);
        
        if (left == "" && right == "") 
            return result;
        if (left == "") 
            return result + "()" + "(" + right + ")";
        if (right == "") 
            return result + "(" + left + ")";
        
        return result + "(" + left + ")" + "(" + right + ")";
    }
}
