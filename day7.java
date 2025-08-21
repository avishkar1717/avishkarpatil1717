class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n < 3) return 0; 
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; 
                } else {
                    water += leftMax - height[left]; 
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]; 
                } else {
                    water += rightMax - height[right]; 
                }
                right--;
            }
        }
        return water;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height2 = {4,2,0,3,2,5};
        int[] height3 = {1,1,1};
        int[] height4 = {5};
        int[] height5 = {2,0,2};

        System.out.println("Water trapped (Test 1): " + sol.trap(height1)); 
        System.out.println("Water trapped (Test 2): " + sol.trap(height2)); 
        System.out.println("Water trapped (Test 3): " + sol.trap(height3)); 
        System.out.println("Water trapped (Test 4): " + sol.trap(height4)); 
        System.out.println("Water trapped (Test 5): " + sol.trap(height5)); 
    }
}


