package dp;

public class LCS {
	
	public int run(String a, String b) {
		return run(a.toCharArray(), b.toCharArray());
	}
	
	public int run(char[] a, char[] b) {
		if (a == null || b == null) {
			throw new IllegalArgumentException("Both Arrays cannot be null");
		}
		return compute(a, b, 0, 0);
	}
	
	private int compute(char[] a, char[] b, int aIndex, int bIndex) {
		if (aIndex >= a.length || bIndex >= b.length) {
			return 0;
		}
		
		if (a[aIndex] == b[bIndex]) {
			return 1 + compute(a, b, aIndex + 1, bIndex + 1);
		}
		return Math.max(compute(a, b, aIndex + 1, bIndex), compute(a, b, aIndex, bIndex + 1));
	}
	
	public int run_dp(String a, String b) {
		return run_dp(a.toCharArray(), b.toCharArray());
	}
	
	private int run_dp(char[] a, char[] b) {
		if (a == null || b == null) {
			throw new IllegalArgumentException("Both Arrays cannot be null");
		}
		
		int[][] dp = new int[a.length + 1][b.length + 1];
		
		for (int i = 0; i <= a.length; i++) {
			for (int j = 0; j <= b.length; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
					continue;
				}
				
				if (a[i - 1] == b[j - 1]) {
					dp[i][j] = 1 + dp[i-1][j-1];
				} else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[a.length][b.length];
	}
}
