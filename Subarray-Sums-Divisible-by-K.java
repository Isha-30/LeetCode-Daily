class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remFreq = new int[k];
        int n = nums.length;
        remFreq[0] = 1;
        int prefix = 0, res = 0;
        for(int i = 0; i< n; i++){
            prefix = (prefix + nums[i]%k + k)%k;
            res += remFreq[prefix]++;
        }
        return res;
    }
}
