class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1,temp;
        while(m<=h){
            if(nums[m]==0){
                temp=nums[m];
                nums[m]=nums[l];
                nums[l]=temp;
                l++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else if(nums[m]==2){
                temp=nums[h];
                nums[h]=nums[m];
                nums[m]=temp;
                h--;
            }
        }
    }
}