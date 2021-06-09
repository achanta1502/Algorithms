package sorting;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] arr = new int[] {12, 11, 13, 5, 6, 7};
		new HeapSort().run(arr);
		new MergeSort().run(arr);
		new QuickSort().run(arr);
		System.out.println(Arrays.toString(arr));
	}

}
