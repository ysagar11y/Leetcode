class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int nums1=-1,nums2=-1,c1=0,c2=0,n=nums.length/3;
        for(int i:nums){
            if(i==nums1) c1++;
            else if(i==nums2) c2++;
            else if(c1==0){
                nums1=i;
                c1=1;
            }
            else if(c2==0){
                nums2=i;
                c2=1;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        
        System.out.println(nums1+" "+nums2);
        List ans=new ArrayList<>();
        c1=0;
        c2=0;
        for(int i:nums){
            if(i==nums1)
                c1++;
            else if(i==nums2)
                c2++;
        }
        if(c1>n)
            ans.add(nums1);
        if(c2>n)
            ans.add(nums2);
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