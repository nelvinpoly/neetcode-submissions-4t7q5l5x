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
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//       List<Integer>result=new ArrayList<>();
//       preorder(root,result);
//       return result;  
//     }
//     private void preorder(TreeNode node,List<Integer> result){
//         if(node==null){
//             return;
//         }
//         result.add(node.val);
//         preorder(node.left,result);
//         preorder(node.right,result);
//     }
// }
public class Solution{
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack= new Stack<>();
        TreeNode cur=root;

        while(cur!=null || !stack.isEmpty()){
            if(cur!=null){
                res.add(cur.val);
                stack.push(cur.right);
                cur=cur.left;
            }else{
                cur=stack.pop();
            }
        }
        return res;
    }
}