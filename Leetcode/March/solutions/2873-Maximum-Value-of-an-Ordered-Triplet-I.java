//https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/description/?envType=daily-question&envId=2025-04-02
class Solution {
    public long maximumTripletValue(int[] nums) {
        // int i=0,j=1,k=2;

        long ans=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    ans=Math.max(ans,((long)nums[i]-nums[j])*nums[k]);
                }
            }
        }
        return ans;
    }
}