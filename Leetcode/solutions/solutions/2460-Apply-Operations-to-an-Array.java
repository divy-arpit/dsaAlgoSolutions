//https://leetcode.com/problems/apply-operations-to-an-array/description/?envType=daily-question&envId=2025-03-01
class Solution {
    public int[] applyOperations(int[] nums) {
        int p=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }

        }
        int[]n= new int[nums.length];
        Arrays.fill(n,0);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                n[p++]=nums[i];
            }
        }
        return n;
    }
}