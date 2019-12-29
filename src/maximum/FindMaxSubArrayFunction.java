package maximum;

public class FindMaxSubArrayFunction {
	// O(n) Reason why this solution works because we are just trying to get the largest sum, but not the index
	public int maxSubArray(int[] nums) {
		// Start from the first element
		int currentMax = nums[0];
		int maxEndHere = nums[0];

		// Starting from index 1 cause index 0 is already the max
		for (int i = 1; i < nums.length; i++) {
			// Bottom up approach
			// Similar to maximum product sub array
			maxEndHere = Math.max(maxEndHere + nums[i], nums[i]);

			// Keeping track of the maximum
			currentMax = Math.max(currentMax, maxEndHere);
		}

		return currentMax;
	}

	// Another way to do it by using dynamic programming
//	 public int maxSubArray(int[] nums){
//		 int[] dp = new int[nums.length];
//	
//		 dp[0] = nums[0];
//	
//		 // Also starts from index 0
//		 int currentMax = dp[0];
//	
//		 // Same as above
//		 for(int i = 1; i < nums.length; i++){
//			 // dp[i-1] is the same thing as the previous
//			 dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
//			 
//			 // since dp[i] will be the current sum end
//			 currentMax = Math.max(currentMax, dp[i]);
//		 }
//	
//		 return currentMax;
//	 }
}
