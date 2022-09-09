class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        while(root != null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                root = root.left;
            }
            if(root==null && !st.isEmpty()){
                root = st.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }
}
