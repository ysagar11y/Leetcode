class Solution {
    public int[][] merge(int[][] intervals) {
        int m=intervals.length;
       
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();
        int[] prev = intervals[0];

        for(int i= 1;i<m;i++){
            if(prev[1]>=intervals[i][0]){
                prev[1]=Math.max(prev[1],intervals[i][1]);
            }
            else{
            ans.add(prev);
            prev = intervals[i];
            }
        }
        ans.add(prev);
        return ans.toArray(new int[ans.size()][]);
    }
}