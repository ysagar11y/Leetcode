class Solution {


    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        int l=0,h=n*m-1;

        while(l<=h){
            int mid=(l+(h-l)/2);
            if(target==matrix[mid/m][mid%m]) return true;
            else if(target>matrix[mid/m][mid%m]) l=mid+1;
            else
                h=mid-1;
        }
        return false;
    }
}