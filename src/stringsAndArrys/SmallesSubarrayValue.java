package stringsAndArrys;

public class SmallesSubarrayValue {
    public int run(int[] arr, int val) throws Exception {
        if (arr == null) {
            throw new IllegalArgumentException("Array should not be null");
        }

        int output = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > val) {
                    output = Math.min(output, j - i + 1);
                    break;
                }
            }
        }
        return output;
    }
}
