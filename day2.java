public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expected_sum = n * (n + 1) / 2;
        int actual_sum = 0;
        for (int num : arr) {
            actual_sum += num;
        }
        return expected_sum - actual_sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println("Missing number: " + findMissingNumber(arr));
    }
}
