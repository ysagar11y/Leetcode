class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0,i=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[c]=nums[i];
                c++;
                i++;
            }
            else{
                i++;
            }
            
        }
        
        return c;
    }
}