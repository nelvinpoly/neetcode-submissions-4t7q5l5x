class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // int n=students.length;
        // Queue<Integer>q=new LinkedList<>();
        // for(int s:students){
        //     q.offer(s);
        // }
        // int res=n;
        // for(int s:sandwiches){
        //     int c=0;
        //     while(c<n && q.peek()!=s){
        //         q.offer(q.poll());
        //         c++;
        //     }
        //     if(q.peek()==s){
        //         q.poll();
        //         res--;
        //     }else{
        //         break;
        //     }
        // }return res;
        int n=students.length;
        int res=n;
        int[] c=new int[2];
        for(int i=0;i<n;i++){
            c[students[i]]++;
        }
        for(int i=0;i<n;i++){
            if(c[sandwiches[i]]>0){
                res--;
                c[sandwiches[i]]--;
            }else{
                break;
            }
        }return res;
    }
}