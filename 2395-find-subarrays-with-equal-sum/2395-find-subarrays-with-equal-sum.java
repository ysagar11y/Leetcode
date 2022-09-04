class Solution {
    public boolean findSubarrays(int[] nums) {
        int a=0,b=0;
        List<Integer> temp=new ArrayList<Integer>();
        for(int i=0;i< nums.length-1;i++){
            if(temp.contains((nums[i]+nums[i+1])))
                return true;
            else 
                temp.add(nums[i]+nums[i+1]);
        }
        return false;
    }
}