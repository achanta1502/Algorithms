package stringsAndArrys;

import java.util.Arrays;

public class TripletsWithSmallerNumber {
	
	public int run(int[] ls, Integer sum) throws Exception {
		
		if (ls == null || ls.length < 3) {
			throw new IllegalAccessException("Array should be null or length less than 2");
		}
	
		
		int output = 0;
		Arrays.sort(ls);
		int size = ls.length;
		for (int i = 0; i < size - 2; i++) {
			int j = i + 1;
			int k = size - 2;
			while (j < k) {
				if (ls[i] + ls[j] + ls[k] > sum) {
					k--;
				} else {

					output += k - j;
					j++;
				}
			}
		}
		return output;
	}
}
