package stringsAndArrys;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class LongestWord {
	
	public String run(List<String> arr) {

		
		Map<String, Integer> map = new HashMap<>();
		for (String i: arr) {
			map.put(i.toLowerCase(), map.getOrDefault(i.toLowerCase(), 0)+ 1);
		}
		
		
		String ans = "";
		
		for (String str: arr) {
			if (str.length() > ans.length() || (str.length() == ans.length() && ans.compareTo(str) > 0) ) {
				
				for (int i = 1; i < str.length(); i++) {
					
					String str_low = str.toLowerCase();
					if (map.containsKey(str_low.substring(0, i)) || (i == str.length() - 1 && map.get(str_low) > 1)) {
						ans = str;
						break;
					}
				}
				
			}
		}
		
		
		return ans;
 	}
}
