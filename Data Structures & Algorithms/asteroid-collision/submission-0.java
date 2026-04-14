class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      Stack<Integer>stack=new Stack<>();
      for(int i:asteroids){
        while(!stack.isEmpty() && i<0 && stack.peek()>0){
          int diff=i+stack.peek();
          if(diff<0){
            stack.pop();
          }else if(diff>0){
            i=0;
          }else{
            i=0;
            stack.pop();
          }  
        }if(i!=0){
            stack.add(i);
        }
      }  return stack.stream().mapToInt(i->i).toArray();
    }
}