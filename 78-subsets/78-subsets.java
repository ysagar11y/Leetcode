class Solution {
    List<List<Integer>> lists;
    public List<List<Integer>> subsets(int[] nums) {
        lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(list,nums,0);
        
        return lists;
    }
    
    void solve(List<Integer> list,int[] nums,int curr)
    {
        
        if(curr == nums.length)
        {
            lists.add(new ArrayList(list));
            return;
        }
        
        list.add(nums[curr]);
        solve(list,nums,curr+1);
        list.remove(list.size() - 1);
        solve(list,nums,curr+1);
        
    }
}

