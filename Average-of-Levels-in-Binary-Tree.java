class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) 
            return result;
        
        q.add(root);
        while(!q.isEmpty()) {
            int n = q.size();
            
            double sum = 0.0;
            
            for(int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null) 
                    q.add(node.right);
            }
            result.add(sum / n);
        }
        return result;

    }
}
