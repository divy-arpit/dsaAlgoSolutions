//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/?envType=daily-question&envId=2025-03-08
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0,min=1000;
        while(l<=blocks.length()-k){
            String temp=blocks.substring(l,l+k);
            int c=0;
            for(char ch:temp.toCharArray()){
                if(ch=='W'){
                    c++;
                }
            }
            min=Math.min(c,min);
            l++;

        }
        return min;
    }
}