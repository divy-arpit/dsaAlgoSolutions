//https://leetcode.com/problems/optimal-partition-of-string/description/
class Solution {
    public int partitionString(String s) {
        int ans=0;
        HashSet<Character> h=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(h.contains(ch)){
                ans++;
                h=new HashSet<>();

            }
            h.add(ch);



        }
        return ++ans;
    }
}