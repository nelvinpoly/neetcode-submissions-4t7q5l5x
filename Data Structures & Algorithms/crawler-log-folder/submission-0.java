class Solution {
    public int minOperations(String[] logs) {
        // Stack<String>stack=new Stack<>();
        // for(String s:logs){
        //     if(s.equals("../")){
        //         if(!stack.isEmpty())
        //             stack.pop();
        //     }else if(!s.equals("./")){
        //         stack.push(s);
        //     }
        // }
        // return stack.size();
        int depth=0;
        for(String s:logs){
            if(s.equals("./")){
                continue;
            }if(s.equals("../")){
                depth=Math.max(0,depth-1);
            }else{
                depth++;
            }
        }return depth;
    }
}