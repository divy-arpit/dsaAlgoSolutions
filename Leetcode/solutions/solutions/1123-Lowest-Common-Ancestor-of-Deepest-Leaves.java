//https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/?envType=daily-question&envId=2025-04-04
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
class Ans{
    public Ans(int depth,TreeNode node){
        this.depth=depth;
        this.node=node;
    }
    int depth;
    TreeNode node;
}
class Solution {

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return Help(root).node;

    }
    private static Ans Help(TreeNode root){
        if(root==null){
            return new Ans(0,null);

        }
        Ans left = Help(root.left);
        Ans right = Help(root.right);
        if(left.depth>right.depth){
            return new Ans(left.depth+1,left.node);
        }
        if(left.depth< right.depth){
            return new Ans(right.depth+1,right.node);
        }
        return  new Ans(left.depth+1,root);



    }
}