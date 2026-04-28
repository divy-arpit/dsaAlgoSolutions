//https://leetcode.com/problems/unique-binary-search-trees-ii/description/
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
    public static void main(String[] args) {
        List<TreeNode> fin  = new Solution().generateTrees(3);
    }
    public List<TreeNode> generateTrees(int n) {
        return ans(1,n);
    }
    private static List<TreeNode> ans(int s, int e){
        if(s>e){
            List<TreeNode> temp = new ArrayList<>();
            temp.add(null); // Correctly handle the null case
            return temp;
        }


        List<TreeNode> l2=new ArrayList<>();
        for(int i=s;i<=e;i++){

            List<TreeNode> lefts=ans(s,i-1);
            List<TreeNode> rights = ans(i+1,e);

            for (TreeNode l : lefts) {
                for (TreeNode r : rights) {
                    TreeNode here=new TreeNode(i);
                    here.left = l;
                    here.right = r;

                    l2.add(here);
                }
            }

        }
        return l2;
    }

}