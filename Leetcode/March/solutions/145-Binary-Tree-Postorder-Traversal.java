//https://leetcode.com/problems/binary-tree-postorder-traversal/?envType=problem-list-v2&envId=stack
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
        // Stack<Integer> s=new Stack();
        List<Integer> l=new ArrayList<>();
        Trav(root,l);

        return l;
    }
    private static void Trav(TreeNode root, List<Integer> s){
        if(root == null){
            return;
        }

        Trav(root.left,s);
        Trav(root.right,s);
        s.add(root.val);

    }
}