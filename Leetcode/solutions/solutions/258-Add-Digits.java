//https://leetcode.com/problems/add-digits/
class Solution {
    public int addDigits(int num) {
        String s=String.valueOf(num);
        int ans=0;
        while(true){
            for(char ch:s.toCharArray()){
                // System.out.println(ch);
                ans+= Character.getNumericValue(ch);
            }
            s=String.valueOf(ans);
            if(s.length()==1){
                return ans;
            }
            else{
                ans=0;
            }
        }

    }
}