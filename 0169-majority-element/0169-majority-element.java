class Solution {
    public int majorityElement(int[] nums) {
        int c=0, ele=0;
        for(int i:nums){
            if(c==0){
                ele=i;
            }
            if(ele==i){
                c++;
            }
            c--;
        }
        return ele;
    }
}