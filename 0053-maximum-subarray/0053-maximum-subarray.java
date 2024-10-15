class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int m=0;

        for(int i=0;i<nums.length;i++){
            m=m+nums[i];
            max=Math.max(m,max);
            if(m<0){
                m=0;
            }
        }
        return max;
    }
}