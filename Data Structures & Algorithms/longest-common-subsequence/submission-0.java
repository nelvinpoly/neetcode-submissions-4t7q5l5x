class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[]=new int[text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            int prev=0;
            for(int j=1;j<=text2.length();j++){
                int temp=dp[j];
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[j]=1+prev;
                }else{
                    dp[j]=Math.max(dp[j],dp[j-1]);
                }prev=temp;
            }
        }return dp[text2.length()];
    }
}
