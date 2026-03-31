// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int len=nums.length;
//         for(int i=0;i<len+1;i++){
//             for(int j=i+1;j<len+1;j++){
//                 if(nums[i]+nums[j]==target){
//                      return new int[] { i, j };
//                 }
//             }
//         }return new int[] {};
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                    return new int[] { i, j }; // Return the indices of the two numbers
                }
            }
        }
        return new int[] {}; // If no solution is found
    }
}
