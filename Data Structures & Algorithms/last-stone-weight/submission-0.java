class Solution {
    public int lastStoneWeight(int[] stones) {
    //    List<Integer> stoneList=new ArrayList<>();
    //    for(int s:stones){
    //     stoneList.add(s);
    //    } 
    //    while(stoneList.size()>1){
    //     Collections.sort(stoneList);
    //     int cur=stoneList.remove(stoneList.size()-1)-stoneList.remove(stoneList.size()-1);
    //     if(cur!=0){
    //         stoneList.add(cur);
    //     }
    //    }return stoneList.isEmpty() ? 0:stoneList.get(0);
    PriorityQueue<Integer> heap=new PriorityQueue<>();
    for(int s:stones){
        heap.offer(-s);
    }
    while(heap.size()>1){
        int first=heap.poll();
        int second=heap.poll();
        if(second>first){
            heap.offer(first-second);
        }
    }heap.offer(0);
    return Math.abs(heap.peek());
    }
}
