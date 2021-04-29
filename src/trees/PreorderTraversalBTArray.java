package trees;

import java.util.Stack;

public class PreorderTraversalBTArray {
	
	public boolean run(int[] arr) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int val = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] < val) {
				return false;
			}
			
			while(!stack.empty() && stack.peek() < arr[i]) {
				val = stack.pop();
			}
			
			stack.add(arr[i]);
		}
		
		return true;
	}
}
