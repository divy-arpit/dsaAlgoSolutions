//https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/?envType=daily-question&envId=2025-04-08
class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> ha=new HashSet<>(nums.length);
        int pos=-1;
        for(int i =nums.length-1;i>=0;i--){
            ha.add(nums[i]);
            if(ha.size()< nums.length-i){
                pos=i;
                break;
            }
        }
        if(pos==-1){
            return 0;
        }
        return (pos+1)%3==0?(pos+1)/3 : (pos+1)/3 +1;
    }
}