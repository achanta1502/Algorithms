package sorting;

public class QuickSort {
	
	public void run(int[] input) throws Exception {
		if (input == null || input.length == 0) {
			throw new IllegalArgumentException("Input should not be null or empty");
		}
		
		quickSort(input, 0, input.length - 1);
	}
	
	private void quickSort(int[] input, int start, int end) {
		if (start < end) {
			int p = partition(input, start, end);
			
			quickSort(input, start, p - 1);
			quickSort(input, p + 1, end);
		}
	}
	
	private int partition(int[] input, int start, int end) {
		int p = input[end];
		
		int index = start - 1;
		
		for (int i = start; i <=end; i++) {
			if (input[i] < p) {
				index++;
				swap(input, index, i);
			}
		}
		swap(input, index + 1, end);
		
		return index + 1;
	}
	
	private void swap(int[] input, int left, int right) {
		int temp = input[left];
		input[left] = input[right];
		input[right] = temp;
	}
}
