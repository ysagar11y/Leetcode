class Solution {

    void merge(int[] nums, int l, int m, int h){
        int n1=m-l+1;
        int n2=h-m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++) L[i]=nums[l+i];
        for(int j=0;j<n2;j++) R[j]=nums[m+j+1];

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(L[i]<=R[j])
                nums[k++]=L[i++];
            else
                nums[k++]=R[j++];
        }

        while(i<n1) nums[k++]=L[i++];
        while(j<n2) nums[k++]=R[j++];
    }

    void mergeSort(int[] nums, int l,int h){
        
        if (l < h) {
            int m=l+(h-l)/2;
            mergeSort(nums,l,m);
            mergeSort(nums,m+1,h);
            merge(nums,l,m,h);
        }
    }

    public int[] sortArray(int[] nums) {

        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}