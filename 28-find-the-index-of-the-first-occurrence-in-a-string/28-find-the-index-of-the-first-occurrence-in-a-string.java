class Solution {
    public int strStr(String haystack, String needle) {
        int i=0,k=0,res=0;
       if (haystack == null || needle == null)
        return -1;
        while(i<haystack.length()){
            if(haystack.charAt(i)!=needle.charAt(k)){
                i=i-k;
                k=0;
                i++;
            }
            else{
                System.out.println(i);
                i++;
                k++;
                if(k==needle.length()){
                    System.out.println(k);
                    return i-k;
                }
                    
            }
        }
        return -1;
    }
}