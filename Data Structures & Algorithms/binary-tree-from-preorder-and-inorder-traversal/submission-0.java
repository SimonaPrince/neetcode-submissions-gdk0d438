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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       HashMap<Integer,Integer> inMem= new HashMap<Integer, Integer>();
        for(int i=0;i<inorder.length;i++){
            inMem.put(inorder[i],i);
        }

       TreeNode root = buildTree(inorder,0,inorder.length-1,preorder,0, preorder.length-1,inMem);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int instart, int inend, int[] preorder, int prestart, int preend, HashMap<Integer,Integer> inMap){
        if((prestart > preend) || (instart > inend))
            return null;
       TreeNode root = new TreeNode(preorder[prestart]);
        int inRoot = inMap.get(root.val);
        int numsLeft= inRoot - instart;

        root.left = buildTree(inorder,instart, inRoot-1, preorder,prestart+1,prestart+numsLeft,inMap);
        root.right=buildTree(inorder,inRoot+1,inend,preorder,prestart+numsLeft+1,preend,inMap);

        return root;
    }
}
