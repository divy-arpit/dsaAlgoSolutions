//https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
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
    public int minDepth(TreeNode root) {
        return Ans(root);
    }
    private static int Ans(TreeNode root){
        if(root==null){
            return 0;
        }
        //right skew
        if(root.left==null && root.right!=null){
            return Ans(root.right)+1;
        }

        // left skew
        if(root.left!=null && root.right==null){
            return Ans(root.left)+1;
        }


        //both ways
        return Math.min(Ans(root.left),Ans(root.right))+1;

    }
}