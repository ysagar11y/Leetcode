class Solution {

    void helper(int[] nums,List<List<Integer>> list,int i, int t, List<Integer> ans){
        if(i==nums.length){
            if(t==0){
                list.add(new ArrayList<>(ans));}
                return;
        }
        
        if(t>=nums[i]){
            ans.add(nums[i]);
            helper(nums,list,i,t-nums[i],ans);
            ans.remove(ans.size()-1);
            }
        
        helper(nums,list,i+1,t,ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list= new ArrayList<>();
        helper(candidates,list,0,target,new ArrayList<>());
        return list;
    }
}