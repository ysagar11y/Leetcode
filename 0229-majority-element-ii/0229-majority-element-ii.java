class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int c1=0,c2=0,e1=0,e2=0,len = nums.length;
        for(int i:nums){
            if(c1==0 && i!=e2){
                e1=i;
                c1=1;
            }
            else if(c2==0 && i!=e1){
                e2=i;
                c2=1;
            }
            else if(i==e1)
                c1++;
            else if(i==e2)
                c2++;
            else{
                c1--;
                c2--;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        c1=0;
        c2=0;
        
        for(int i=0;i<len;i++)
        {
            if(nums[i] == e1)
                c1++;
            else if(nums[i]==e2)
                c2++;
        }

        System.out.println(c1+" "+c2+" "+e1+" "+e2);

        if(c1>len/3)
            ans.add(e1);
        if(c2>len/3)
            ans.add(e2);
        return ans;
    }
}