package stringsAndArrys;

public class ZigZag {
	
	public int[] run(int[] input) throws Exception {
		
		if (input == null) {
			throw new IllegalAccessException("input should not be null");
		}
		
		if (input.length <= 1) {
			return input;
		}
		
		boolean flag = false;
		
		for (int i = 0; i < input.length - 1; i++) {
			if (flag) {
				if (input[i] > input[i+1]) {
					int temp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = temp;
				}
			} else {
				if (input[i] < input[i+1]) {
					int temp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = temp;
				}
			}
			flag = !flag;
		}
		return input;
	}
}
