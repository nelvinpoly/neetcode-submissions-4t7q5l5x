class Solution {
    public String simplifyPath(String path) {
    // Stack<String> stack=new Stack<>();
    // StringBuilder sb=new StringBuilder();
    // for(char c:(path+"/").toCharArray()){
    //     if(c=='/'){
    //         if(sb.toString().equals("..")){
    //             if(!stack.isEmpty()){
    //                 stack.pop();
    //             }
    //         }else if(!sb.toString().equals("")&&!sb.toString().equals(".")){
    //                 stack.push(sb.toString());
    //         }sb.setLength(0);
    //     }else{
    //         sb.append(c);
    //     }
    // }    return "/"+String.join("/",stack);
    Stack<String> stack=new Stack<>();
    String[] paths=path.split("/");
    for(String i:paths){
        if(i.equals("..")){
            if(!stack.isEmpty()){
                stack.pop();
            }
        }else if(!i.equals("") && !i.equals(".")){
            stack.push(i);
        }
    }
    return "/"+String.join("/",stack);
    }
}