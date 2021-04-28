package bitManipulation;

public class MaxSubarrayXOR {
	public int run(int[] arr) throws Exception {
		
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array should nt be null or empty");
		}
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length - 1; i++) {
			int ans = 0;
			for (int j = i; j < arr.length; j++) {
				ans ^= arr[j];
				max = Math.max(max, ans);
				}
			}
	
		return max;
	}
}
