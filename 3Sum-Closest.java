class Solution {
    public int threeSumClosest(int[] nums, int target) {
        List<Integer> sums = new ArrayList<>();

		Arrays.sort(nums);

		// apply same 3sum logic
		for (int i = 0; i < nums.length; i++) {

			int currtarget = target - nums[i]; // choose the current sum as target - curr element that you are holding
												// out

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[left] + nums[right];
				if (sum == currtarget) { // if you find equal , it means you have found target and that is closest to
											// target(obviously)
					return target;
				}
				if (sum > currtarget) {
					right--;
				} else {
					left++;
				}
				if (left == right) { // store the sum only when left == right, this means you have traversed the
										// whole array and reached to a point where you cannot get any more closer to
										// target
					sums.add(sum + nums[i]); // store all the most closest possible sums to target
					break;
				}
			}

		}
		int res = 0;
		int min = Integer.MAX_VALUE;

		for (int i : sums) { // find out the one that is closest out of all
			if (min > Math.abs(i - target)) {
				min = Math.abs(i - target);
				res = i;
			}
		}

		return res;
    }
}
