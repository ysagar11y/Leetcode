class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(n*m!=r*c)
            return mat;
        int[][] res=new int[r][c];
        int a = 0, b = 0;
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                res[a][b] = mat[i][j];
                b=b+1;
                if(b >= c){
                    b = 0;
                    a++;
                }
            }
        }
        return res;
        }
}