class Solution {
    
    public int longestSubarray(int[] nums) {
        
        int t=0;
        for (int num : nums) {
            t = Math.max(t, num);
        }
        
        int res=0,till=0;
        
        for(int i=0;i<nums.length;i++){

            if(nums[i]==t){
                till++;
                res=Math.max(till,res);
            }
            else
                till=0;
        }
        
        return res;
        
    }
}