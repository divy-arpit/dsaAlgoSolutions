//https://leetcode.com/problems/zero-array-transformation-ii/description/?envType=daily-question&envId=2025-03-13
class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {

        int lQ=0,rQ=queries.length;
        boolean done=false;
        int[]diff=new int[nums.length+1];
        Arrays.fill(diff,0);
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int val=queries[i][2];
            diff[l]+=val;
            diff[r+1]-=val;
        }
        if(!got0(nums,diff)){
            return -1;
        }

        while(lQ<=rQ){
            int  mid=lQ+(rQ-lQ)/2;


            diff=new int[nums.length+1];
            Arrays.fill(diff,0);
            for(int i=0;i<mid;i++){
                int l=queries[i][0];
                int r=queries[i][1];
                int val=queries[i][2];
                diff[l]+=val;
                diff[r+1]-=val;
            }
            if(got0(nums,diff)){
                rQ=mid-1;
            }
            else{
                lQ = mid+1;
            }


        }
        return lQ;

    }
    private static boolean got0(int[]nums, int[]diff){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=diff[i];
            if(nums[i]>sum){
                return false;
            }

        }
        return true;
    }

}