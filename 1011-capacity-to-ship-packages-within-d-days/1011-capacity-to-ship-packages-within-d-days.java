class Solution {
    
    private boolean can(int[] weights, int capacity, int D) {
        int day = 1, w = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > capacity || day > D) return false;
            if (w + weights[i] > capacity) {
                w = weights[i];
                day++;
            } else {
                w += weights[i];
            }
        }
        return day <= D;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int i=0,j=Arrays.stream(weights).sum();
        while(i<=j){
            int mid=(i+j)/2;
            if(can(weights,mid,days))
               j=mid-1;
            else
               i=mid+1;
        }
        return i;
    }
}
