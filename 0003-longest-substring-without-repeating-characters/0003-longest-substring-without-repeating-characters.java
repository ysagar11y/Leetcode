class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        
        while (j < arr.length) {
            if (set.contains(arr[j])) {
                set.remove(arr[i]);
                i++;
            } else {
                set.add(arr[j]);
                ans = Math.max(j - i + 1, ans);
                j++;
            }
        }
        return ans;
    }
}