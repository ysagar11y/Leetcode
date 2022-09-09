class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res =  new ArrayList<Integer>();
            long temp=1;
            for (int i=0; i<=rowIndex; i++){
                res.add((int)temp);
                temp*=(rowIndex-i);
                temp/=(i+1);
            }
        return res;
    }
}