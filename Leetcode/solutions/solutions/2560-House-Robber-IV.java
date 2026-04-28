//https://leetcode.com/problems/house-robber-iv/?envType=daily-question&envId=2025-03-15
class Solution {
    public int minCapability(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max= -1;
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(min<=max){
            int mid=min+(max-min)/2;
            if(Check(nums,k,mid)){
                ans.add(mid);
                max=mid-1;
            }
            else{
                min=mid+1;
            }

        }
        int fin=Integer.MAX_VALUE;
        for(int i=0;i<ans.size();i++){
            fin=Math.min(fin,ans.get(i));
        }
        return fin;

    }
    private static boolean Check(int[]nums, int k, int min){
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=min){
                c++;
                i++;
            }
        }
        return c>=k;
    }
}