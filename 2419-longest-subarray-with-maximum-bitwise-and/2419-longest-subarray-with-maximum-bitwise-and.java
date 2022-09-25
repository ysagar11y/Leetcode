class Solution {
    
    public int find(int arr[])
    {
        int max=0;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
    
    public int longestSubarray(int[] nums) {
        
        int t=find(nums);
        System.out.println(t);
        
        int res=0,till=0;
        
        for(int i=0;i<nums.length;i++){

            if(nums[i]==t){
                till++;
                res=Math.max(till,res);
            }
            else
                till=0;
        }
        
        return res;
        
    }
}