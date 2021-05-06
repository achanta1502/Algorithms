package stringsAndArrys;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws Exception {
//		ReverseStringWithoutSpecialChars r = new ReverseStringWithoutSpecialChars();
//		System.out.println(r.run("a*b$c^^d*e"));
//		PalindromePartitions p = new PalindromePartitions();
//		System.out.println(p.run("nitin"));
//		TripletsWithSmallerNumber t = new TripletsWithSmallerNumber();
//		System.out.println(t.run(new int[] {5, 1, 3, 4, 7}, 12));
//		ZigZag z = new ZigZag();
//		System.out.println(Arrays.toString(z.run(new int[] {4, 3, 7, 8, 6, 2, 1})));
		PossibleSortedArrays arr = new PossibleSortedArrays();
		System.out.println(arr.run(Arrays.asList(10, 15, 25), Arrays.asList(1, 5, 20, 30)).stream().map(x -> x.toString()).collect(Collectors.toList()));
		System.out.println(new LongestContinuousSequence().run(new int[] {1, 56, 58, 57, 90, 92, 94, 93, 91, 45}));
		System.out.println(new PythogeronTriplet().run(new int[] {10, 4, 6, 12, 5}));
		System.out.println(new SmallesSubarrayValue().run(new int[] {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}, 280));
		System.out.println(new SmallestValue().run(new int[] {1, 2, 6, 10, 11, 15}));
		System.out.println(new smallestWindowSubstr().run("thisisateststring", "tist"));
	}
	
}
