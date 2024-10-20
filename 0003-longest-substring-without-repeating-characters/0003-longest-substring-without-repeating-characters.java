class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        
        while (j < arr.length) {
            if (set.contains(arr[j])) {
                // Duplicate found, shrink the window from the left
                set.remove(arr[i]);
                i++;
            } else {
                // Add the character to the set and expand the window
                set.add(arr[j]);
                // Update the answer with the current window length
                ans = Math.max(j - i + 1, ans);
                j++;
            }
        }
        return ans;
    }
}