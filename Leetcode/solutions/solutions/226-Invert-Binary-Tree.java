//https://leetcode.com/problems/invert-binary-tree/description/
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
    public TreeNode invertTree(TreeNode root) {
        return ans(root);
    }
    private static TreeNode ans(TreeNode r){
        if(r==null){
            return null;
        }
        TreeNode k=new TreeNode(r.val);
        k.right=ans(r.left);
        k.left=ans(r.right);
        return k;
    }
}