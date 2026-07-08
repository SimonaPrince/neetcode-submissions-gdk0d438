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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> traversal=new ArrayList<>();
       if(root == null){
            return  traversal;
        }
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> data= new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode curr= queue.remove();
            if(curr != null){
                data.add(curr.val);
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right !=null){
                    queue.add(curr.right);
                }
            }
            else{
                traversal.add(data);
                if(queue.isEmpty()){
                    break;
                }
                else{
                    queue.add(null);
                }
                data= new ArrayList<>();
            }
        }

        return traversal;
    }
}
