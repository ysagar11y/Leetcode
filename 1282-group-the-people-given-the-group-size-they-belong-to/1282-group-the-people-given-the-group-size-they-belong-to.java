class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        List<List<Integer>> res= new ArrayList<>();
        
        for(int i=0;i<groupSizes.length;i++){
            int curr=groupSizes[i];
            List<Integer> temp= map.getOrDefault(curr,new ArrayList());
            temp.add(i);
            map.put(curr,temp);
            
            if(temp.size()==curr){
                res.add(temp);
                map.remove(curr);
            }
        }
        return res;
    }
}