class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        long res=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            {
                c++;
                res+=c;
             }
            
            else 
            {
                ans=ans+res;
                c=0;
                
            }
        }
        return res;
    }
}