//https://leetcode.com/problems/partition-equal-subset-sum/?envType=daily-question&envId=2025-04-07
class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        int targetSum = totalSum / 2;
        int n = nums.length;
        boolean[] dp = new boolean[targetSum + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int s = targetSum; s >= num; s--) {
                dp[s] = dp[s] || dp[s - num];
            }
        }

        return dp[targetSum];
    }
}