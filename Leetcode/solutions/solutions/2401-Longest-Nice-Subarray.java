//https://leetcode.com/problems/longest-nice-subarray/?envType=daily-question&envId=2025-03-18
class Solution {
    //4->100
    //2->010
    //3->100
    //110
    public int longestNiceSubarray(int[] nums) {
        int l=0,r=nums.length;
        int max=1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(Check(nums,mid)){
                l=mid+1;
                max=mid;
            }
            else{
                r=mid-1;
            }
        }
        return max;
    }
    private static boolean Check(int[]nums,int len){
        if(len<=1) return true;
        for(int l=0;l<=nums.length-len;l++){
            int bitmask=0;
            boolean isNice = true;
            for(int r=l;r<l+len;r++){
                if((bitmask & nums[r])!=0){
                    isNice = false;
                    break;
                }
                bitmask |=nums[r];
            }
            if(isNice){
                return true;
            }
        }
        return false;

    }
}