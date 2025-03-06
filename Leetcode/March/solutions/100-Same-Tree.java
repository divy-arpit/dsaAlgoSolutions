//https://leetcode.com/problems/same-tree/?envType=problem-list-v2&envId=breadth-first-search
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return Ans(p,q);
    }
    private boolean Ans(TreeNode p, TreeNode q){
        if((p==null && q!=null)||(p!=null && q==null)){
            return false;
        }
        if(p==null && q==null){
            return true;
        }
        return Ans(p.right,q.right) && Ans(p.left,q.left) && (p.val==q.val);
    }
}