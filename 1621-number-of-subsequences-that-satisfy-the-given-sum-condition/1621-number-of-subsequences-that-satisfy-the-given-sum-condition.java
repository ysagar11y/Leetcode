import java.util.ArrayList;
import java.util.List;

class Solution {
    

    public int numSubseq(int[] nums, int target) {
        int mod = 1_000_000_007;
        int n = nums.length;
        Arrays.sort(nums);
        
        int[] powers = new int[n];
        powers[0] = 1;
        for (int i = 1; i < n; i++) {
            powers[i] = (powers[i - 1] * 2) % mod;
        }
        
        int i = 0, j = n - 1;
        int ans = 0;

        while (i <= j) {
            if (nums[i] + nums[j] <= target) {
                ans = (ans + powers[j - i]) % mod;
                i++;
            } else {
                j--;
            }
        }

        return ans;
    }
}