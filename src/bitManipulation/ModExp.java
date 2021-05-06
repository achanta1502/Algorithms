package bitManipulation;

public class ModExp {
	
	public int run(int x, int y) {
		int res = 1;
		
		while (y > 0) {
			if ((y & 1) != 0) {
				res = res * x;
			}
			
			y = y >> 1;
			x = x * x;
		}
		return res;
	}
}
