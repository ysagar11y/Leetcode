class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) 
            return false;
            int n=matrix.length;
            int m=matrix[0].length;
            int l=0;
            int r=n*m-1;
            
            while(l<=r){
                int mid=(l+(r-l)/2);
                if(matrix[mid/m][mid%m]==target)
                    return true;
                else if(matrix[mid/m][mid%m]<target)
                    l=mid+1;
                else
                    r=mid-1;
            }
            
        return false;
        
        }
}

// int m=matrix[0].length;
        // int n=matrix.length;
        // int i=0,j=m-1;
        // while(i<n&&j>=0){
        //     if(matrix[i][j]==target)
        //         return true;
        //     if(matrix[i][j]<target)
        //         i++;
        //     else
        //         j--;
        // }
        // return false;