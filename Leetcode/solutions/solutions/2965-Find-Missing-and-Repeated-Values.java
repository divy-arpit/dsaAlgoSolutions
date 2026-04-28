//https://leetcode.com/problems/find-missing-and-repeated-values/description/?envType=daily-question&envId=2025-03-06
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] g) {
        int[] ans=new int[2];
        HashSet<Integer> h1=new HashSet<>(g.length*g.length);
        for(int[]j:g){
            for(int i:j){
                if(h1.contains(i)){
                    ans[0]=i;
                }
                h1.add(i);
            }
        }
        for(int i=1;i<=g.length*g.length;i++){
            if(!h1.contains(i)){
                ans[1]=i;
            }
        }

        return ans;
    }
}