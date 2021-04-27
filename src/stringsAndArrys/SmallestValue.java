package stringsAndArrys;

public class SmallestValue {
    public int run(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array should be empty or null");
        }

        int output = 1;
        for (int i = 0; i < arr.length && arr[i] <= output; i++) {
            output += arr[i];
        }
        return output;
    }
}
