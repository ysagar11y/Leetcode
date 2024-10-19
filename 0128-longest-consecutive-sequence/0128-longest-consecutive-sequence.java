class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        int max=0;
        for(int i:nums){
            int cmax=0,temp=i;
            if(set.contains(temp-1)) continue;
            while(set.contains(temp)){
                temp++;
                cmax++;
            }
            max=Math.max(max,cmax);
        }
        return max;
    }
}