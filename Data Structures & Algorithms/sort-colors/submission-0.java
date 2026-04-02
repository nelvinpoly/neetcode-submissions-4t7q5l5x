class Solution {
    public void sortColors(int[] nums) {
      int i=0,l=0,r=nums.length-1;
      while(i<=r){
        if(nums[i]==0){
           int temp=nums[l];
           nums[l]=nums[i];
           nums[i]=temp;
           l++;
        }else if(nums[i]==2){
          int temp=nums[i];
           nums[i]=nums[r];
           nums[r]=temp;  
           r--;i--;
        }i++;
      }  
    }
}