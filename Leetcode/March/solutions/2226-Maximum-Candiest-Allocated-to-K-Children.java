//https://leetcode.com/problems/maximum-candies-allocated-to-k-children/description/?envType=daily-question&envId=2025-03-14
class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max =0;
        for(int i:candies){
            max=Math.max(max, i);
        }


        ArrayList<Integer> candidate=new ArrayList<Integer>(candies.length);
        //binary seach(1-min) -> find max at which it might satisfy
        int l=0,r=max;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(Sat(mid,candies,k)){
                //move right
                candidate.add(mid);
                l=mid+1;
            }
            else{
                //move left
                r=mid-1;
            }
        }
        int ans=0;

        for(int i=0;i<candidate.size();i++){
            ans=Math.max(ans,candidate.get(i));
        }
        return ans;
    }

    private static boolean Sat(int cho, int[]candies,long k){
        if(cho==0){
            return true;
        }
        long ans=0;
        for(int i:candies){
            ans+=(i/cho);
        }
        return ans>=k;
    }
}