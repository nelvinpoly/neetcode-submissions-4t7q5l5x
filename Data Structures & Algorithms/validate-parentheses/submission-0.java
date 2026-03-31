class Solution {
    public boolean isValid(String string) {
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(char c:string.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.isEmpty()&&stack.peek()==map.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }return stack.isEmpty();
    }
}
