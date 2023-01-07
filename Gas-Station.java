class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int total = 0, curr = 0, start = 0;
        
        for(int i = 0; i<len; i++){
            total += gas[i]-cost[i];
            curr += gas[i] - cost[i];
            if(curr<0){
                curr = 0;
                start = i+1;
            }
        }
        
        return (total<0) ? -1 : start;
    }
}
