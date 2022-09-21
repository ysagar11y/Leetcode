class Solution {
    
    public void sub(int ind,int[] nums,List<List<Integer>> ans,List<Integer> list){
        ans.add(new ArrayList<>(list));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            sub(i+1,nums,ans,list);
            list.remove(list.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        sub(0,nums,ans,new ArrayList<>());
        return ans;
    }
}