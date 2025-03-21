//https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/description/
class Solution {
    public int findMinFibonacciNumbers(int k) {
        //fn+1 = fn+1 + fn
        int f1=1,f2=1;
        int newFeb=0;
        ArrayList<Integer> fibs=new ArrayList<>(1000000);
        fibs.add(f1);
        fibs.add(f2);
        while(newFeb>=0){
            newFeb=f1+f2;
            fibs.add(newFeb);
            f1=f2;
            f2=newFeb;
        }
        int kt=k;
        int ans=0;
        while(kt>0){
            kt-=MinLess(fibs,kt);
            ans++;
        }
        return ans;
    }
    private static int MinLess(ArrayList<Integer> fibs, int num){
        int l=0,r=fibs.size();
        int ans=Integer.MIN_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            int x=fibs.get(mid);
            if(x>num){
                r=mid-1;
            }
            else{
                ans=x;
                l=mid+1;
            }
        }
        return ans;
    }
}