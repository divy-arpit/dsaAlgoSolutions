//https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/?envType=daily-question&envId=2025-04-09
import java.util.Arrays;

class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[0]<k){
            return -1;
        }
        ArrayList<Integer> lis= new ArrayList<>();
        for(int i:nums){
            lis.add(i);
        }
        lis.add(k);
        Collections.sort(lis);

        HashSet<Integer> hashSet=new HashSet<>();
        for(int i:lis){
            if(i>k){
                hashSet.add(i);
            }
        }
        return hashSet.size();
    }
}
