class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int currentSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            currentSum+= nums[i];
            int rem = currentSum %k;
            if(rem==0 && i>0){
			    // i>0 because there has to be atleast 2 elements in arr.
                return true;
            }
            // both remainders are same number that is only possible when the left over part in between them is a multiple of k or 0 too.
            // For ex in 23,2,4,6,7 case at 0 rem is 5 for 23, at 3 rem is 5 again but for sum 29, this is possible only when the difference in between is 0, 6,12,18.. etc, then only it will get same remainder.
            if(map.containsKey(rem)){
                if(i - map.get(rem) > 1 ){
                    //there are more than 2 elements.
                    return true;
                }
            }else{
                map.put(rem ,i);
            }
              
        }
        return false;
    }
}
