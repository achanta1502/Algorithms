package dp;

public class EditDistance {
	
	public int run(String a, String b) {
		if (a == null || b == null) {
			throw new IllegalArgumentException("input strings cannot be null");
		}
		
		if (a.length() == 0) {
			return b.length();
		}
		
		if (b.length() == 0) {
			return a.length();
		}
		
		return compute(a, b, 0, 0);
	}
	
	private int compute(String a, String b, int aIndex, int bIndex) {
		if (aIndex >= a.length()) {
			return b.length() - bIndex;
		}
		
		if (bIndex >= b.length()) {
			return a.length() - aIndex;
		}
		
		if (a.charAt(aIndex) == b.charAt(bIndex)) {
			return compute(a, b, aIndex + 1, bIndex + 1);
		}
		
		return 1 + Math.min(Math.min(compute(a, b, aIndex + 1, bIndex), compute(a, b, aIndex, bIndex + 1)), compute(a, b, aIndex + 1, bIndex + 1));
	}
	
	public int run_dp(String a, String b) {
		if (a == null || b == null) {
			throw new IllegalArgumentException("input strings cannot be null");
		}
		
		int m = a.length();
		int n = b.length();
		
		if (m == 0) {
			return n;
		}
		
		if (m == 0) {
			return n;
		}
		
		int[][] dp = new int[m + 1][n + 1];
		
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <=n; j++) {
				if (i == 0) {
					dp[i][j] = j;
					continue;
				}
				
				if (j == 0) {
					dp[i][j] = i;
					continue;
				}
				
				if (a.charAt(i - 1) == b.charAt(j - 1)) {
					dp[i][j] = dp[i-1][j-1];
					continue;
				}
				
				dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
			}
		}
		
		return dp[m][n];
	}
}
