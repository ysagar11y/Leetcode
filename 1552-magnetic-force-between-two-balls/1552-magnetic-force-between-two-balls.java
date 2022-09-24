class Solution {
    
    public Boolean can(int[] position, int m,int mid){
        int count = 1;
        int last = position[0];
        for (int i = 0; i < position.length; i++) {
            if (position[i] - last >= mid) {
                last = position[i];
                count++;
            }
        }
        return count >= m;
    }
    
    
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lo = 0;
        int hi = position[position.length-1];
        int optimal = 0;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if (can(position, m, mid)) {
                optimal = mid;
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return optimal;
    }
}