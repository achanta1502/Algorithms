package dp;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(new LCS().run("AGGTAB", "GXTXAYB"));
		System.out.println(new LCS().run_dp("AGGTAB", "GXTXAYB"));
		System.out.println(new LIS().run(new int[] {50, 3, 10, 7, 40, 80}));
		System.out.println(new LIS().run_dp(new int[] {50, 3, 10, 7, 40, 80}));
		System.out.println(new EditDistance().run("sunday", "saturday"));
		System.out.println(new EditDistance().run_dp("sunday", "saturday"));
	}
}
