class Solution {
    public int subarraySum(int[] arr, int k) {
        int c = 0, s = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize with prefix sum 0 to handle cases where a subarray equals k from the start
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            // Check if (current sum - k) exists in the map
            if (map.containsKey(s - k)) {
                c += map.get(s - k); // Increment the count by the frequency of (s - k)
            }

            // Add the current sum to the map, or update its frequency
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        return c; 
    }
}
