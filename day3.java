class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];          
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;  
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1, 3, 4, 2, 2};
        System.out.println("Duplicate: " + sol.findDuplicate(arr1)); 
        int[] arr2 = {3, 1, 3, 4, 2};
        System.out.println("Duplicate: " + sol.findDuplicate(arr2));

        int[] arr3 = {1, 1};
        System.out.println("Duplicate: " + sol.findDuplicate(arr3));
        int[] arr4 = {1, 4, 4, 2, 3};
        System.out.println("Duplicate: " + sol.findDuplicate(arr4));
        int n = 100000;
        int[] arr5 = new int[n + 1];
        for (int i = 1; i <= n; i++) arr5[i - 1] = i;
        arr5[n] = 50000; 
        System.out.println("Duplicate: " + sol.findDuplicate(arr5));
    }
}
