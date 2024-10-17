class Solution {

    // Helper function to perform binary search on a 1D array
    public static boolean helper(int[] arr, int l, int h, int t) {
        if (l > h) {
            return false; // Base case: Target not found
        }

        int m = l + (h - l) / 2; // Calculate mid to avoid overflow

        if (arr[m] == t) {
            return true; // Target found
        }

        if (t > arr[m]) {
            return helper(arr, m + 1, h, t); // Search right half
        } 

        return helper(arr, l, m - 1, t); // Search left half
    }

    // Function to search for a target in a 2D matrix
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns

        // Iterate over each row to find the appropriate range for the target
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][m - 1]) {
                // Perform binary search on the row
                return helper(matrix[i], 0, m - 1, target);
            }
        }

        return false; // Target not found in any row
    }
}