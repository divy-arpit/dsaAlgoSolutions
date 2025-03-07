//https://leetcode.com/problems/closest-prime-numbers-in-range/description/?envType=daily-question&envId=2025-03-07
class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[]primes=prime(left,right);
        ArrayList<Integer> lis=new  ArrayList<>();
        int[]ans=new int[2];
        Arrays.fill(ans,-1);
        for(int i=Math.max(left,2);i<=right;i++){
            if(primes[i]){
                lis.add(i);
            }
        }
        // System.out.println(lis);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<lis.size()-1;i++){
            if(lis.get(i+1)-lis.get(i)<min){
                min=lis.get(i+1)-lis.get(i);
                ans[0]=lis.get(i);
                ans[1]=lis.get(i+1);
            }
        }
        return ans;


    }
    private boolean[] prime(int l,int r){
        boolean[] nums=new boolean[r+10];
        Arrays.fill(nums,true);
        for(int i=2;i<r;i++){
            if(!nums[i]){
                continue;
            }
            for(int j=i*i;j<=r && j>0;j+=i){
                nums[j]=false;

            }
        }
        // System.out.println(Arrays.toString(nums));
        return nums;
    }
}