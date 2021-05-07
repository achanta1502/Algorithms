package sorting;

public class HeapSort {
	
	public void run(int[] input) throws Exception {
		if (input == null || input.length == 0) {
			throw new IllegalArgumentException("Input should not be null or empty");
		}
		
		int len = input.length;
		for (int i = (len/2) - 1; i >= 0; i--) {
			heapify(input, len, i);
		}
		
		for (int i = len - 1; i > 0; i--) {
			swap(input, 0, i);
			heapify(input, i, 0);
		}
	}
	
	private void heapify(int[] input, int len, int pos) {
		
		int left = pos * 2 + 1;
		int right = pos * 2 + 2;
		int max = pos;
		
		if (left < len && input[max] < input[left]) {
			max = left;
		}
		
		if (right < len && input[max] < input[right]) {
			max = right;
		}
		
		if (max != pos) {
			swap(input, pos, max);
			heapify(input, len, max);
		}
	}
	
	private void swap(int[] input, int left, int right) {
		int temp = input[left];
		input[left] = input[right];
		input[right]= temp;
	}
}
