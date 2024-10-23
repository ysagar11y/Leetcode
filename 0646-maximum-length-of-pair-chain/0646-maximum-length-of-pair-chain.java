class Solution {
    public int findLongestChain(int[][] pairs) {

        // PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        // int max=0;
        // for(int i=0;i<start.length;i++) {
        //     pq.add(new int[]{start[i],end[i]});
        // }
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

        int c=1,max=pairs[0][1];
        
        for (int i=1;i<pairs.length;i++) {
           
            if(max<pairs[i][0]){
                c++;
                max=pairs[i][1];
            }
        }
        return c;
        
    }
}

