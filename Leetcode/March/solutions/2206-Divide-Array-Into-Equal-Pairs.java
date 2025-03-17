//https://leetcode.com/problems/divide-array-into-equal-pairs/description/?envType=daily-question&envId=2025-03-17
class Solution {
    public boolean divideArray(int[] nums) {
        int[]c=new int[501];
        for(int i:nums){
            c[i]++;
        }
        for(int i:c){
            if(i%2!=0){
                return false;
            }
        }
        return true;
    }
}