package stringsAndArrys;

import java.util.HashSet;
import java.util.Set;

public class PythogeronTriplet {
	
	public boolean run(int[] arr) throws Exception {
		if (arr.length == 2) {
			return false;
		}
		
		Set<Integer> store = new HashSet<Integer>();
		for (int i : arr) {
			store.add(i * i);
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (store.contains(arr[i] * arr[i] + arr[j] * arr[j])) {
					return true;
				}
			}
		}
		
		return false;
	}
}
