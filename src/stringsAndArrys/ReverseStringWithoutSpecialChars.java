package stringsAndArrys;

public class ReverseStringWithoutSpecialChars {
	
	public String run(String input) throws Exception {
		
		if (input == null) {
			throw new IllegalAccessException("Input should not be null");
		}
		
		StringBuilder sb = new StringBuilder(input);
		
		if (input.length() <= 1) return sb.toString();
		
		int startIndex = 0;
		int endIndex = sb.length() - 1;
		
		while (startIndex < endIndex) {
			char sChar = sb.charAt(startIndex);
			char eChar = sb.charAt(endIndex);

			if (isNotSpecialChar(sChar)) {
				startIndex++;
			} else if (isNotSpecialChar(eChar)) {
				endIndex--;
			} else {
				sb.setCharAt(startIndex, eChar);
				sb.setCharAt(endIndex, sChar);
				startIndex++;
				endIndex--;
			}
		}
		
		return sb.toString();
	}
	
	private boolean isNotSpecialChar(char c) {
		return !((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')); 
	}
}
