class Solution {
    public int longestMountain(int[] arr) {

        int longest = 0;

        // A mountain needs at least 3 elements
        for (int i = 1; i < arr.length - 1; i++) {

            // Check if i is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {

                // Move left from the peak
                int left = i;
                while (left > 0 && arr[left - 1] < arr[left]) {
                    left--;
                }

                // Move right from the peak
                int right = i;
                while (right < arr.length - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                // Calculate current mountain length
                int length = right - left + 1;

                // Keep the longest mountain
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}