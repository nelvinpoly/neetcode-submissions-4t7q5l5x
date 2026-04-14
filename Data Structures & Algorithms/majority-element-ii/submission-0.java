class Solution {
    public List<Integer> majorityElement(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int size=nums.length;
      for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
      }  
      List<Integer> res=new ArrayList<>();
      for(int key:map.keySet()){
        int frequency=0;
        for(int n:nums){
            if(n==key){
                frequency++;
            }
        }if(frequency>(size/3)){
            res.add(key);
        }
      }return res;
    }
}