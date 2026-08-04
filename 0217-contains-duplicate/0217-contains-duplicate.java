//Approach 1 :

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i< nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }
}

// //Approach 2 :

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0; i< nums.length-1; i++) {
//             if (nums[i] == nums[i+1]) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }