class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,sum=0,max=0;
        while(i<j){
            sum=Math.min(height[i],height[j])*(j-i);
            if(sum>max)
                max=sum;
            if(height[i]<height[j])
                i++;
            else
                j--;
            
        }
        return max;
    }
}
