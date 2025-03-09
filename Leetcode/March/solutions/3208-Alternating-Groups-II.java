//https://leetcode.com/problems/alternating-groups-ii/?envType=daily-question&envId=2025-03-09
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {

        int[] arr=new int[colors.length+k-1];
        System.arraycopy(colors, 0, arr, 0, colors.length);
        if (k >= 0) System.arraycopy(colors, 0, arr, colors.length, k-1);
        int ans=0;

        //sliding window
        int l=0,r=1;
        while (r<arr.length){
            if(arr[r]==arr[r-1]){
                //pattern broken
                l=r;
                r=r+1;
            }
            else{

                if(r-l+1==k){
                    ans++;
                    l++;
//                    r++;
                }
                r++;
            }
        }
//        System.out.println(ans);
        return ans;
    }
}