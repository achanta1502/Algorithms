package dp;

import java.util.Arrays;

public class LIS {
	
	public int run(int[] arr) throws Exception {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array should nmot be null or empty");
		}
		
		return compute(arr, 0, Integer.MIN_VALUE);
	}
	
	private int compute(int[] arr, int index, int max) {
		
		if (index >= arr.length) {
			return 0;
		}
		
		int val = 0;
		
		if (arr[index] > max) {
			val =  1 + compute(arr, index + 1, arr[index]);
		}
		val = Math.max(val, compute(arr, index + 1, max));
		return Math.max(val, compute(arr, index + 1, arr[index]));
	}
	
	public int run_dp(int[] arr) throws Exception {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array should nmot be null or empty");
		}
		
		int[] dp = new int[arr.length];
		Arrays.fill(dp, 1);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
					dp[i] = dp[i] + 1;
				}
			}
		}
		return Arrays.stream(dp).max().getAsInt();
	}
}
