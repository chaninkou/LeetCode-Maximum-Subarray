package leetcode53;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindMaxSubArrayFunction solution = new FindMaxSubArrayFunction();
		
		System.out.println("Solution: " + solution.maxSubArray(nums));
	}
}
