// class Solution {
//     public int[][] kClosest(int[][] points, int k) {
//         PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparing(a->a[0]));
//         for(int[] point:points){
//             int d=point[0]*point[0]+point[1]*point[1];
//             pq.offer(new int[] {d,point[0],point[1]});
//         }
//         int[][] res=new int[k][2];
//         for(int i=0;i<k;i++){
//             int[] point=pq.poll();
//             res[i]=new int[]{point[1],point[2]};
//         }
//         return res;
//     }
// }
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[0]*a[0] + a[1]*a[1] - b[0]*b[0] - b[1]*b[1]));
        
        for(int[] pt:points)
            minHeap.offer(pt);
        
        int[][] result = new int[k][2];

        for(int i=0;i<k;i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}