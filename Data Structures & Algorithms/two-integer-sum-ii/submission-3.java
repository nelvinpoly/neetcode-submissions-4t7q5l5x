class Solution {
    public int[] twoSum(int[] numbers, int target) {
    // HashMap<Integer,Integer> map=new HashMap<>();
    // for(int i=0;i<numbers.length;i++){
    //     int diff=target-numbers[i];
    //     if(map.containsKey(diff)){
    //         return new int[] {map.get(diff),i+1};
    //     }
    //     map.put(numbers[i],i+1);
    // }
    // return new int[0];
    // }
    int l=0,r=numbers.length-1;
    while(l<r){
        int sum=numbers[l]+numbers[r];
        if(sum>target){
            r--;
        }else if(sum<target){
            l++;
        }else{
            return new int[] {l+1,r+1};
        }
    }
    return new int[0];
    }
}
