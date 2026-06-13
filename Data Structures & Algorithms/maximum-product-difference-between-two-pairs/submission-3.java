class Solution {
    public int maxProductDifference(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // return (-(nums[0]*nums[1])+(nums[n-1]*nums[n-2]));
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE,max1=0,max2=0;
        for(int i:nums){
            if(i>max1){
                max2=max1;
                max1=i;
            }else if(i>max2){
                max2=i;
            }
            if(i<min1){
                min2=min1;
                min1=i;
            }else if(i<min2){
                min2=i;
            }
        }return(max1*max2)-(min1*min2);

    }
}