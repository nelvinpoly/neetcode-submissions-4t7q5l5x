class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int l=0,r=people.length-1;
        while(l<=r){
            int re=limit-people[r--];
            count++;
            if(l<=r && re>=people[l]){
                l++;
            }
            
        }
        return count;
    }
}