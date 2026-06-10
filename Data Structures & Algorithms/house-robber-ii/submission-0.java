class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[1];
        return Math.max(dfs(nums,0,n-2),dfs(nums,1,n-1));
    }
    public int dfs(int[] nums,int start,int end){
        int rob1=0,rob2=0;
        for(int i=start;i<=end;i++){
            int top=Math.max(rob1+nums[i],rob2);
            rob1=rob2;
            rob2=top;
        }return rob2;
    }
}
