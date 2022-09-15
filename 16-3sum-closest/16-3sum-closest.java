class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int closest = nums[0] + nums[1] + nums[2];
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++) {
            
            int l = i+1, r = nums.length - 1;
            
            while(l < r) {
                
                int threeSum = nums[i] + nums[l] + nums[r];
                
                if(threeSum > target)
                    r--;
                
                else
                    l++;
                
                if(Math.abs(threeSum - target) < Math.abs(closest - target))
                    closest = threeSum;
            }
        }
        
        return closest;
    }
}