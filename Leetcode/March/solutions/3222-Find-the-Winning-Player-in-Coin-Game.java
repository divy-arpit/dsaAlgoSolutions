//https://leetcode.com/problems/find-the-winning-player-in-coin-game/
class Solution {
    public String winningPlayer(int x, int y) {
        //y=4,x=1
        int rem=Math.min(x/1,y/4);
        if(rem%2==0){
            return "Bob";
        }
        else{
            return "Alice";
        }
    }
}