//https://leetcode.com/problems/count-total-number-of-colored-cells/description/?envType=daily-question&envId=2025-03-05
class Solution {
    public long coloredCells(int n) {
        long x=1;
        for(int i=1;i<n;i++){
            x+=4*(i);
        }
        return x;
    }
}
//1->1
//2->5, +4
//3->13, +8
//4->13+4+8 = 25 ,+12
//5->41, +16
//4,8,12,