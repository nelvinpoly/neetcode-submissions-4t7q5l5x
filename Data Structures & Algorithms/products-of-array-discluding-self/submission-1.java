// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int len=nums.length;
//         int[] res=new int[len];
       
//         for(int i=0;i<len;i++){
//             int value=1;
//             for(int j=0;j<len;j++){
//                if(i!=j){
//                 value*=nums[j];
//                }
//             }res[i]=value;
//         }return res;
//     }
// }  
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
      int res[]=new int[n];
      res[0]=1;
      for(int i=1;i<n;i++){
        res[i]=res[i-1]*nums[i-1];
      }
      int postfix=1;
      for(int i=n-1;i>=0;i--){
        res[i]*=postfix;
        postfix*=nums[i];
      }return res;
    }
}  

