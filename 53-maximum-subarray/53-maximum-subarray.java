class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            sum=Math.max(sum,0);
        }
        return max;
    }
}