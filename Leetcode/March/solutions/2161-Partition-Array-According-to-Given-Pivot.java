//https://leetcode.com/problems/partition-array-according-to-given-pivot/?envType=daily-question&envId=2025-03-03
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> al = new ArrayList<>(nums.length);
        ArrayList<Integer> ar = new ArrayList<>(nums.length);
        ArrayList<Integer> am= new ArrayList<>(nums.length);
        int x=0;
        for(int i:nums){
            if(i<pivot){
                al.add(i);
            }
            else if(i>pivot){
                ar.add(i);

            }
            else{
                am.add(i);

            }
        }
        int[] ans = new int[nums.length];
        for(int n:al){
            ans[x++]=n;
        }
        for(int n:am){
            ans[x++]=n;
        }
        for(int n:ar){
            ans[x++]=n;
        }
        return ans;
    }
}