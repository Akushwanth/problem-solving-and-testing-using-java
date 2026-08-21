class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        
        // Interleave x1,y1,x2,y2,...,xn,yn
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];        // Place xi
            ans[2 * i + 1] = nums[i + n]; // Place yi
        }
        
        return ans;
    }
}
