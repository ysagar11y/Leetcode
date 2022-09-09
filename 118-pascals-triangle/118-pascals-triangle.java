class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (numRows <=0){
            return ans;
        }
        for (int i=0; i<numRows; i++){
            List<Integer> res =  new ArrayList<Integer>();
            int temp=1;
            for (int j=0; j<i+1; j++){
                res.add(temp);
                temp=temp*(i-j);
                temp=temp/(j+1);
            }
            ans.add(res);
        }
        return ans;
    }
}

