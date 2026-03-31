class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] res=new int[len];
       
        for(int i=0;i<len;i++){
            int value=1;
            for(int j=0;j<len;j++){
               if(i!=j){
                value*=nums[j];
               }
            }res[i]=value;
        }return res;
    }
}  
