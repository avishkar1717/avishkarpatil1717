class Solution {
    public List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        
        int maxRight = arr[n - 1];
        leaders.add(maxRight);
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                leaders.add(arr[i]);
                maxRight = arr[i];
            }
        }
        
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println("Leaders: " + sol.findLeaders(arr));
    }
}
