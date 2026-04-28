//https://leetcode.com/problems/solving-questions-with-brainpower/description/?envType=daily-question&envId=2025-04-01
class Solution {
    static long[]dp;
    public static void main(String[] args) {
        int[][] qus = new int[][] {{3,2},{4,3},{4,4},{2,5}};
        System.out.println(new Solution().mostPoints(qus));
    }
    public long mostPoints(int[][] questions) {
        dp=new long[questions.length+1];
        Arrays.fill(dp,-1);
        return Help(questions,0);
    }
    private static long Help(int[][] questions, int pos){

        if(pos>=questions.length){
            return 0;
        }
        if(dp[pos]!=-1){
            return dp[pos];
        }
        // take qus
        int x= questions[pos][0];
        int y=questions[pos][1];
        long ans1= Help(questions,pos+y+1) + x;

        // skip qus
        long ans2 =Help(questions,pos+1);

        return dp[pos]=Math.max(ans1,ans2);
    }
}