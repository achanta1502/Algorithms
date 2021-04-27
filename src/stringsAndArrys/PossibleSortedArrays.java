package stringsAndArrys;

import java.util.ArrayList;
import java.util.List;

public class PossibleSortedArrays {
	public List<List<Integer>> run(List<Integer> a, List<Integer> b) throws Exception {
		
		if (a == null || b == null || a.size() == 0 || b.size() == 0) {
			throw new IllegalArgumentException("input lists should atleast contain one element");
		}
		
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		run(a, b, 0, 0, output, false, new ArrayList<>());
		return output;
	}
	
	private void run(List<Integer> a, List<Integer> b, int aIndex, int bIndex, List<List<Integer>> output, boolean end, List<Integer> dummy) {
		
		if (!end && dummy.size() > 0) {
			output.add(new ArrayList<Integer>(dummy));
		}
		
		if (aIndex >= a.size() || bIndex >= b.size()) {
			return;
		}
		
		if (!end) {
			
			
			
			for(int i = aIndex; i < a.size(); i++) {
				int temp_a = a.get(i);
				if (dummy.size() == 0 || dummy.get(dummy.size()-1) < temp_a) {
					dummy.add(temp_a);
					run(a, b, i + 1, bIndex, output, !end, dummy);
				}
			}
		} else {
			for(int i = bIndex; i < b.size(); i++) {
				System.out.println(i);
				int temp_b = b.get(i);
				if (dummy.get(dummy.size()-1) < temp_b) {
					dummy.add(temp_b);
				}
				run(a, b, aIndex, i + 1, output, !end, dummy);
			}
		}
	}
}
