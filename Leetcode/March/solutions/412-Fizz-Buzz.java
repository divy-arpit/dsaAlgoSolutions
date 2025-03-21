//https://leetcode.com/problems/fizz-buzz/description/
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3==0){
                ans.add("FizzBuzz");
            }
            else if(i%5==0){
                ans.add("Buzz");
            }
            else if(i%3==0){
                ans.add("Fizz");
            }
            else{
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
} 