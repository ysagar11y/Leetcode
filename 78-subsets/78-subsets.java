class Solution {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        permutation(list,nums,0);   
        return lists;
    }
    void permutation(List<Integer> list,int[] nums,int curr)
    {
        if(curr == nums.length)
        {
            lists.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[curr]);
        permutation(list,nums,curr+1);
        list.remove(list.size() - 1);
        permutation(list,nums,curr+1);
    }
}

