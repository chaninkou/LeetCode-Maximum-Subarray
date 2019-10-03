package maximum;

public class FindMaxSubArrayFunction {
	// O(n)
	public int maxSubArray(int[] nums) {
		// Start from the first element
		int currentMax = nums[0];
		int maxEndHere = nums[0];

		for (int i = 1; i < nums.length; i++) {
			// Bottom up approach
			// Similar to maximum product sub array
			maxEndHere = Math.max(maxEndHere + nums[i], nums[i]);

			// Keeping track of the maximum
			currentMax = Math.max(currentMax, maxEndHere);
		}

		return currentMax;
	}

	// Another way to do it by creating dummy array
	// public int maxSubArray(int[] nums){
	// int[] dp = new int[nums.length];

	// dp[0] = nums[0];

	// int currentMax = dp[0];

	// for(int i = 1; i < nums.length; i++){
	// dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
	// currentMax = Math.max(currentMax, dp[i]);
	// }

	// return currentMax;
	// }
}
