class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1=0,p2=0;
        String s="";
        while(p1<word1.length() && p2<word2.length()){
            s=s+word1.charAt(p1++);
            s=s+word2.charAt(p2++);
        }
        s=s+word1.substring(p1);
        s=s+word2.substring(p2);
        return s;
    }
}