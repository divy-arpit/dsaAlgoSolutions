//https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/description/
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[]xCor = new int[points.length];
        int x=0;
        for(int[]i :points){
            xCor[x++]=i[0];
        }
        Arrays.sort(xCor);
        int max=0;
        for(int i=0;i<xCor.length-1;i++){
            max= Math.max(max, xCor[i+1]-xCor[i]);
        }
        return max;
    }
}