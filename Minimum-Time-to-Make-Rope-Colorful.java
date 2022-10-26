class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res = 0, max_time = 0, sum_time = 0, n = colors.length();
        for (int i = 0; i < n; ++i) {
            if (i > 0 && colors.charAt(i) != colors.charAt(i - 1)) {
                res += sum_time - max_time;
                sum_time = max_time = 0;
            }
            sum_time += neededTime[i];
            max_time = Math.max(max_time, neededTime[i]);
        }
        res += sum_time - max_time;
        return res;
    }
}
