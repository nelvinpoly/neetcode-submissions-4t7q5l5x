class Solution {
    public int rob(int[] nums) {
        int rob1=0,rob2=0;
        for(int i:nums){
            int top=Math.max(rob1+i,rob2);
            rob1=rob2;
            rob2=top;
        }return rob2;
    }
}
