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
	// The last element of dp does not keep track of the maximum, unique case
	 public int maxSubArray1(int[] nums){
		 // dp will keep of the maximum between the current element or previous dp + current element
		 int[] dp = new int[nums.length];
	
		 dp[0] = nums[0];
	
		 // Also starts from index 0
		 int currentMax = dp[0];
	
		 for(int i = 1; i < nums.length; i++){
			 // maximum of dp[i-1] + nums[i] or nums[i]
			 dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
			 
			 // currentMax will just keep track of the max value of dp
			 currentMax = Math.max(currentMax, dp[i]);
		 }
	
		 return currentMax;
	 }
	
}
