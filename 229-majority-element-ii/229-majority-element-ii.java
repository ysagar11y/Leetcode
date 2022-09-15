class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int number1 = -1, number2 = -1, count1 = 0, count2 = 0, len = nums.length;
        
        for(int i=0;i<len;i++)
        {
            if(nums[i]==number1)
                count1++;
            else if(nums[i]==number2)
                count2++;
            else if(count1==0)
            {
                number1=nums[i];
                count1=1;
            }
            else if(count2==0)
            {
                number2=nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        count1=0;
        count2=0;
        
        for(int i=0;i<len;i++)
        {
            if(nums[i] == number1)
                count1++;
            else if(nums[i]==number2)
                count2++;
        }
        if(count1>len/3)
            ans.add(number1);
        if(count2>len/3)
            ans.add(number2);
        return ans;
    }
}


        // List<Integer> list=new ArrayList<>();
        // Map<Integer,Integer> map =new HashMap<>();
        // int ch=nums.length/3;
        // for(int i:nums){
        //     int cnt = map.getOrDefault(i, 0)+1;
        //     map.put(i,cnt);
        //     System.out.println(i+" "+cnt);
        //     if(cnt>ch){
        //         if(!list.contains(i))
        //         list.add(i);
        //     }
        // }
        // return list;