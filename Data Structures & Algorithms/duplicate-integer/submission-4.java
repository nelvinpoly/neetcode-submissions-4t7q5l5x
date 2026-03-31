class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    return true;
                }
            }
        }return false;
    }
}

// class Solution{
//     public boolean hasDuplicate(int[] nums){
//         HashSet<Integer> ht=new HashSet<>();
//         for(int i=nums.length-1;i>=0;i--){
//             if(ht.contains(nums[i])){
//                 return true;
//             }else{
//                 ht.add(nums[i]);
//             }
//         }return false;
//     }
// }
