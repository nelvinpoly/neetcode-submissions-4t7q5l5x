class Solution {
    public int subarraySum(int[] nums, int k) {
        // int res=0;
        
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //         res++;
        //     }
        //     }
            
        // }return res;

        int curSum=0,res=0;
        Map<Integer,Integer>prefixSums=new HashMap<>();
        prefixSums.put(0,1);
        for(int num:nums){
            curSum+=num;
            int diff=curSum-k;
            res +=prefixSums.getOrDefault(diff,0);
            prefixSums.put(curSum,prefixSums.getOrDefault(curSum,0)+1);
        }
        return res;
    }
}