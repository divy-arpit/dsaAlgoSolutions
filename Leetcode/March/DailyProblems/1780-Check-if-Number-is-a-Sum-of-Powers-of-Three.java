//https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/?envType=daily-question&envId=2025-03-04
class Solution {
    public boolean checkPowersOfThree(int n) {
        return Help(n,0);
    }
    private static boolean Help(int n, int p){
        if(n==0){
            return true;
        }
        if(n<0){
            return false;
        }
        if(p>14){
            return false;
        }
        // take current power
        boolean a1= Help(n-(int)(Math.pow(3,p)),p+1);
        // skip current power
        boolean a2 = Help(n,p+1);
        return a1 || a2;
    }
}