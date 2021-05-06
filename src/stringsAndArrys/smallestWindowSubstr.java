package stringsAndArrys;

//2 Pointer Approach
public class smallestWindowSubstr {
	
	public String run(String str, String pattern) throws Exception {
		if (str == null || pattern == null || str.length() == 0 || pattern.length() == 0) {
			throw new IllegalArgumentException("String and paatern should not be null and empty");
		}
		
		if (str.length() < pattern.length()) {
			throw new IllegalArgumentException("Pattern length should be less or equal to String");
		}
		
		if (str.equals(pattern)) {
			return str;
		}
		
		int[] ptr_count = new int[26];
		int[] str_count = new int[26];
 		for (char i: pattern.toCharArray()) {
 			ptr_count[i - 'a']++;
 		}
 		
 		int start = 0, first = -1, min = Integer.MAX_VALUE, count = 0;
 		
 		for (int i = 0; i < str.length(); i++) {
 			char temp = str.charAt(i);
 			
 			str_count[temp - 'a']++;
 			if (str_count[temp - 'a'] <= ptr_count[temp - 'a']) {
 				count++;
 			}
 			
 			if (count == pattern.length()) {
 				while (str_count[str.charAt(start) - 'a'] > ptr_count[str.charAt(start) - 'a']
 						|| ptr_count[str.charAt(start) - 'a'] == 0) {
 					if (str_count[str.charAt(start) - 'a'] > ptr_count[str.charAt(start) - 'a']) {
 						str_count[str.charAt(start) - 'a']--;
 					}
 					start++;
 				}
 				
 				if (min > i - start + 1) {
 					first = start;
 					min = i - start + 1;
 				}
 			}
 		}
		return first == -1 ? "": str.substring(first, first + min);
	}
}
