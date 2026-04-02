public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        // int n = height.length;
        // int res = 0;

        // for (int i = 0; i < n; i++) {
        //     int leftMax = height[i];
        //     int rightMax = height[i];

        //     for (int j = 0; j < i; j++) {
        //         leftMax = Math.max(leftMax, height[j]);
        //     }
        //     for (int j = i + 1; j < n; j++) {
        //         rightMax = Math.max(rightMax, height[j]);
        //     }

        //     res += Math.min(leftMax, rightMax) - height[i];
        // }
        // return res;
        int res=0;
        int l=0,r=height.length-1;
        int leftMax=height[l],rightMax=height[r];
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax=Math.max(leftMax,height[l]);
                res+=leftMax-height[l];
            }else{
                r--;
                rightMax=Math.max(rightMax,height[r]);
                res+=rightMax-height[r];
            }
        }return res;
    }
}