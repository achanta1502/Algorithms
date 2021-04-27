package stringsAndArrys;

public class LongestContinuousSequence {
	
	public int run(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		return compute(arr, 0, 0);
	}
	
	private int compute(int[] arr, int index, int v) {
		if (index >= arr.length) {
			return 0;
		}
		
		int val = 0;
		
		for (int i = index; i < arr.length; i++) {
			
			if (arr[i] > v) {
				val = Math.max(val, 1 + compute(arr, i + 1, arr[i]));
			}

			val = Math.max(val, compute(arr, i + 1, arr[i]));
			
		}
		return val;
	}
}
