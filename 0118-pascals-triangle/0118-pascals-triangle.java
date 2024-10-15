class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows <=0){
            return res;
        }
        
        for(int i=0;i<numRows;i++){
            List<Integer> arr = new ArrayList<Integer>();
            int temp=1;
            for(int j=0;j<i+1;j++){
                arr.add(temp);
                temp=temp*(i-j);
                temp=temp/(j+1);
            }
            res.add(arr);
        }
        return res;
    }
}