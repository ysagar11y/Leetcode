class Solution {
    public boolean canJump(int[] nums) {
        int m=0,i=0;
        while(i<nums.length && i<=m){
            m=Math.max(m,i+nums[i]);
            i++;
        }
        return m>=nums.length-1;
    }
}