package stringsAndArrys;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PalindromePartitions {
	
	private Set<String> palindrome = new HashSet<>();
	private Set<String> notPalindrome = new HashSet<>();

	public List<String> run(String input) throws Exception {
		
		if (input == null) {
			throw new IllegalArgumentException("Input should not be null");
		}
		
		List<List<String>> combinations = new ArrayList<>();
		combinations(combinations, 0, input.length(), new ArrayList<String>(), input);
		return combinations.stream()
				.map(x -> x.toString()).collect(Collectors.toList());
	}
	
	private void combinations(List<List<String>> combinations, int start, int end, List<String> deepArray, String input) {
		if (start >= end) {
			combinations.add(new ArrayList<String>(deepArray));
			return;
		}
		
		for(int i = start; i < end; i++) {
			if (isPalindrome(input.substring(start, i + 1))) {
				deepArray.add(input.substring(start, i + 1));
				combinations(combinations, i + 1, end, deepArray, input);
				deepArray.remove(deepArray.size()-1);
			}
		}
	}
	
	private boolean isPalindrome(String input) {
		
		if (palindrome.contains(input)) {
			return true;
		}
		
		if (notPalindrome.contains(input)) {
			return false;
		}
		
		int startIndex = 0;
		int endIndex = input.length() - 1;
		
		while (startIndex < endIndex) {
			if (input.charAt(startIndex) != input.charAt(endIndex)) {
				notPalindrome.add(input);
				return false;
			}
			startIndex++;
			endIndex--;
		}
		palindrome.add(input);
		return true;
	}
}
