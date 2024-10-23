class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,m=0;
        for(int i:nums){
            if(i==1){
                m++;
            }
            else{
                max=Math.max(m,max);
                m=0;
            }
        }
        return Math.max(max,m);
    }
}