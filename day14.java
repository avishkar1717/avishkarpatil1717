import java.util.*;
public class CountKDistinctSubstrings {
    private static int countAtMostK(String s, int k) {
        int n = s.length();
        int left = 0, result = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }
            result += (right - left + 1);
        }
        return result;
    }
    public static int countExactlyK(String s, int k) {
        return countAtMostK(s, k) - countAtMostK(s, k - 1);
    }

    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        System.out.println(countExactlyK(s, k)); 
    }
}
