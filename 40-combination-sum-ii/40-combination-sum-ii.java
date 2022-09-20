class Solution {
    
    public void comb(int i,int[] arr,int t,List<List<Integer>> ans,List<Integer> list){
        if(t==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int j=i;j<arr.length;j++){
            if(j>i && arr[j]==arr[j-1]) 
                continue;
            if(arr[j]>t)
                break;
        
        list.add(arr[j]);
        comb(j+1,arr,t-arr[j],ans,list);
        list.remove(list.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        Arrays.sort(candidates);
        comb(0,candidates,target,ans,list);
        return ans;
    }
}