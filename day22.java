import java.util.*;
public class FirstElementToRepeatKTimes {
    public static int firstElementToRepeatKTimes(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) == k) {
                return num;
            }
        }
        return -1; 
    }
     public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1, 4};
        int k = 2;
        int result = firstElementToRepeatKTimes(arr, k);
        System.out.println(result); 
    }
}
