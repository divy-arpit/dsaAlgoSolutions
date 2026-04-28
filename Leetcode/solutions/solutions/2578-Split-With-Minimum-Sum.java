//https://leetcode.com/problems/split-with-minimum-sum/description/
class Solution {
    public int splitNum(int num) {
        ArrayList<Character> ans=new ArrayList<>();
        while(num>0){
            ans.add(Character.forDigit(num%10,10));
            num/=10;
        }
        Collections.sort(ans);
        int ans1=0;
        int ans2=0;
        for(int i=0;i<ans.size();i++){
            if(i%2==0)
                ans1=ans1*10 + Character.getNumericValue(ans.get(i));
            else
                ans2=ans2*10 + Character.getNumericValue(ans.get(i));
        }



        return ans1+ans2;
    }
}