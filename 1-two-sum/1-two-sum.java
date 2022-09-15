class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        List<Integer> l=new ArrayList<>();
        for(int i:nums)
            l.add(i);
        System.out.println(l);
        for(int i=0;i<nums.length;i++){
            if(l.contains(target-nums[i])&& l.indexOf(target-nums[i])!=i)
            {
                res[0]=i;
                res[1]=l.indexOf(target-nums[i]);
                break;
            }
        }
        return res;
    }
}