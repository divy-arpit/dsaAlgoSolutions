//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/submissions/1570925336/?envType=daily-question&envId=2025-03-12
class Solution {
    public int maximumCount(int[] nums) {
        int p=0,n=0;
        for(int i:nums){
            p+=i>0? 1:0;
            n+=i<0? 1:0;
        }
        return Math.max(p,n);
    }
}