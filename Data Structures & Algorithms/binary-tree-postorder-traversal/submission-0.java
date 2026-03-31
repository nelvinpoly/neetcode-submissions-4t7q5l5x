/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;

        while(cur!=null || !stack.isEmpty()){
            if(cur!=null){
                result.add(cur.val);
                stack.push(cur);
                cur=cur.right;
            }else{
                cur=stack.pop();
                cur=cur.left;
            }
        } Collections.reverse(result);
        return result;
    }
}