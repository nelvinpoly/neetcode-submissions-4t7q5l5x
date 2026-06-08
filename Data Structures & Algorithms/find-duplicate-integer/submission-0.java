class Solution {
    public int findDuplicate(int[] nums) {
    //    Arrays.sort(nums);
    //    for(int i=0;i<nums.length;i++){
    //     if(nums[i]==nums[i+1]) return nums[i];
    //    }return 0;
    int slow=0,fast=0;
    while(true){
        slow=nums[slow];
        fast=nums[nums[fast]];
        if(slow==fast) break;
    }
    int slow2=0;
    while(true){
        slow=nums[slow];
        slow2=nums[slow2];
        if(slow==slow2) return slow;
    }
    }
}
