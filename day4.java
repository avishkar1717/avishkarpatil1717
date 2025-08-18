import java.util.Arrays;

public class InPlaceMerge {

    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }

    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int gap = m + n;
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            int i, j;
            for (i = 0; i + gap < m; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }
            for (j = (gap > m) ? (gap - m) : 0; i < m && j < n; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
            if (j < n) {
                for (j = 0; j + gap < n; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        int[] arr3 = {10, 12, 14};
        int[] arr4 = {1, 3, 5};
        merge(arr3, arr4, arr3.length, arr4.length);
        System.out.println("arr1 = " + Arrays.toString(arr3));
        System.out.println("arr2 = " + Arrays.toString(arr4));
    }
}
