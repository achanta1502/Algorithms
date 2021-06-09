package sorting;

import java.util.Arrays;

public class MergeSort {
	
	public void run(int[] input) throws IllegalArgumentException {
		if (input == null || input.length == 0) {
			throw new IllegalArgumentException("Input should not be null or empty");
		}
		mergeSort(input, 0, input.length - 1);
	}
	
	private void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			sort(arr, start, mid, end);
		}
	}
	
	private void sort(int[] arr, int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			arr1[i] = arr[start + i];
		}
		for (int i = 0; i < n2; i++) {
			arr2[i] = arr[mid + i + 1];
		}
		int i = 0, j = 0;
		int k = start;
		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;
			} else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}
}
