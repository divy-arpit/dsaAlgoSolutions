//https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/?envType=daily-question&envId=2025-03-02
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int p1=0, p2=0;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(nums1.length+nums2.length);
        while(p1<nums1.length&&p2<nums2.length){
            //p1<p2 -> p1++;
            if(nums1[p1][0]<nums2[p2][0]){
                ArrayList<Integer> t=new  ArrayList<Integer>();
                t.add(nums1[p1][0]);
                t.add(nums1[p1][1]);
                ans.add(t);
                p1++;
            }
            //p1>p2
            else if(nums1[p1][0]>nums2[p2][0]){
                ArrayList<Integer> t=new  ArrayList<Integer>();
                t.add(nums2[p2][0]);
                t.add(nums2[p2][1]);
                ans.add(t);
                p2++;
            }
            //p1==p2
            else{
                ArrayList<Integer> t=new  ArrayList<Integer>();
                t.add(nums2[p2][0]);
                t.add(nums2[p2][1]+nums1[p1][1]);
                ans.add(t);
                p2++;
                p1++;
            }
        }

        while(p1<nums1.length){
            ArrayList<Integer> t=new  ArrayList<Integer>();
            t.add(nums1[p1][0]);
            t.add(nums1[p1][1]);
            ans.add(t);
            p1++;
        }
        while(p2<nums2.length){
            ArrayList<Integer> t=new  ArrayList<Integer>();
            t.add(nums2[p2][0]);
            t.add(nums2[p2][1]);
            ans.add(t);
            p2++;
        }
        int[][]fin = new int[ans.size()][2];
        int z=0;
        for(ArrayList<Integer> k:ans){
            fin[z][0]=k.get(0);
            fin[z++][1]=k.get(1);
        }
        return fin;
    }
}