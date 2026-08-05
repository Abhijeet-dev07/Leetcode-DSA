//Brute Force O (n log n)
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int[] sol = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             sol[i] = nums[i] * nums[i];
//         }
//         Arrays.sort(sol);
//         return sol;
//     }
// }

//Optimal Solution using Two Pointers O(n)
class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                ans[index] = leftSquare;
                left++;
            } else {
                ans[index] = rightSquare;
                right--;
            }

            index--;
        }

        return ans;
    }
}