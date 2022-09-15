class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map =new HashMap<>();
        int ch=nums.length/3;
        for(int i:nums){
            int cnt = map.getOrDefault(i, 0)+1;
            map.put(i,cnt);
            System.out.println(i+" "+cnt);
            if(cnt>ch){
                if(!list.contains(i))
                list.add(i);
            }
        }
        return list;
    }
}