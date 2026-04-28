//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/editorial/?envType=daily-question&envId=2025-03-11
class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr=new int[3];
        Arrays.fill(arr,0);
        int l=0,r=0;
        int ans=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            arr[(int)ch-97]++;
            while(Ans(arr)){

                ans+=(s.length()-r);
                arr[(int)(s.charAt(l))-97]--;
                l++;
//                r++;
            }

            r++;

            System.out.println(ans);
        }
        return ans;
    }
    private static boolean Ans(int[]arr){
        for(int i:arr){
            if(i==0){
                return false;
            }
        }
        return true;
    }
}