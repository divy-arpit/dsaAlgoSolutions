 class  Class12{

    public static void main(String[] args) {
        gcdOfStrings("ABCABC","ABC");
        
    }
        public static String gcdOfStrings(String str1, String str2) {
        String s1=str1,s2=str2;
        if(str1.length()<str2.length()){
            s1=str2;
            s2=str1;
        }
        

   

        String ans="";

        int l=0,r=0;
        for(l=0;l<r;l++){
            for(r=l;r<=s2.length();r++){
                String temp = s2.substring(l,r);
                String ans2 = helper(s1,temp);
                System.out.println(temp);
                ans=ans.length()>ans2.length()?ans:ans2;
                }
            }
            return ans;
    }

    private static String helper(String s1, String s2) {
        if (s1.length() % s2.length() != 0) {
            return "";
        }
        String n = "";
        int num = s1.length() / s2.length();
        for (int i = 0; i < num; i++) {
            n = n + s2;
        }
        if (s1.equals(n)) {
            return s2;
        }
        return "";

}
 }
