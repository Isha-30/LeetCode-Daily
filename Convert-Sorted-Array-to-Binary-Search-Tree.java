class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length ==0){
            return null;
        }
        return helper(nums, 0, nums.length-1);
    }
    
    private TreeNode helper(int[] nums, int start, int end){
        if (start > end){
            return null;
        }
        int middle = (start+end)/2;
        TreeNode n = new TreeNode(nums[middle]);
        n.left = helper(nums, start, middle-1);
        n.right = helper(nums, middle+1, end);
        return n;
    }
}
