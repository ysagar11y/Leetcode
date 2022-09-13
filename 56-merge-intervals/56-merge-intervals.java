class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
			return intervals;
        
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        
        List<int[]> list = new ArrayList<>();
        int [] temp = intervals[0];
        list.add(temp);
        for(int[] interval: intervals){
            if(interval[0]<=temp[1])
                temp[1]=Math.max(interval[1],temp[1]);
            else{
                temp=interval;
                list.add(temp);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
