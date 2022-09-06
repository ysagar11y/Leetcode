class Solution {
    public int[] sortArray(int[] nums) {
        int minv,maxv=minv=nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]>maxv) {
				maxv=nums[i];
			}
			if(nums[i]<minv) {
				minv=nums[i];
			}
		}
		int n=maxv-minv;
		int[]arr2=new int[n+1];
		for (int i = 0; i < nums.length; i++) {
			
				arr2[nums[i]-minv]++;
		}
		int k=0;
		for (int i = 0; i < arr2.length;i++ ) {
			
			for (int j=0; j < arr2[i]; j++) {
				
				nums[k++]=minv+i;
				
			}
		}
		return nums;
    }
}