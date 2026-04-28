//https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/?envType=daily-question&envId=2025-03-26
class Solution {
    //

    //p = Ax
    public int minOperations(int[][] grid, int x) {
        int[] gr=new int[grid.length*grid[0].length];
        long sum=0;
        int rem=grid[0][0]%x;
        int pos =0;
        for(int[] i:grid){
            for(int j:i){
                gr[pos++]=j;
                sum+=j;
                if(j%x!=rem){
                    return -1;
                }
            }
        }
        Arrays.sort(gr);

        int median = gr[gr.length/2];
        int ans=0;

        for(int i:gr){
            // System.out.println((median-i)/x);
            ans+=Math.abs((median-i)/x);
        }
        return ans;

    }
}
