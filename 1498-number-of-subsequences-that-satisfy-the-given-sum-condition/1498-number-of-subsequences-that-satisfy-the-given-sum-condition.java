class Solution {
    
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);  
        int i=0,j=nums.length-1,count=0,mod=(int)1e9 + 7;
        int[] power=new int[nums.length];
        power[0]=1;
        for(int idx=1;idx<nums.length;idx++)
            power[idx]=(power[idx-1]*2)%mod;  
        while(i<=j){
            if(nums[i]+nums[j]<=target){
                count=(count+power[j-i])%mod;
                i++;
            }else if(nums[i]+nums[j]>target)
                j--;
        }
        return count;
    }
    
}


//   RECURSION
// int count=0;
//     public void perm(int[] nums,int i,List<Integer> list,int t){
//         if(i == nums.length)
//         {
//             list = new ArrayList(list);
//             int min=Integer.MAX_VALUE;
//             int max=-1;
//             for(Integer k : list) {
//                 if (min > k) 
//                     min = k;
//                 if(max < k)
//                     max=k;
//             }
//             if(min+max<=t)
//                 count++;
//             return;
//         }
        
//         list.add(nums[i]);
//         perm(nums,i+1,list,t);
//         list.remove(list.size() - 1);
//         perm(nums,i+1,list,t);
        
//     }
    
//     public int numSubseq(int[] nums, int target) {
//         List<Integer> list=new ArrayList<>();
//         perm(nums,0,list,target);
//         return count;
//     }
