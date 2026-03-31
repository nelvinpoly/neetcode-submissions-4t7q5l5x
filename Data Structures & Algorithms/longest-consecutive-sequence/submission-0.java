class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int longest=0;
        for(int s:set){
            if(!set.contains(s-1)){ 
                int length=1;
                while(set.contains(s+length)){
                    length++;
                }longest=Math.max(longest,length);
            }
        }return longest;

    }
}
