public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        char[] ca1 = s.toCharArray();
        char[] ca2 = t.toCharArray();

        int indexS=0, indexT=0;
        while(indexT<t.length()){
            if(ca1[indexS]==ca2[indexT]){
                indexS++;
                if (indexS == s.length()) return true;
            }
            indexT++;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
        s = "axc";
        t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
        s ="acb";
        t = "ahbgdc";
        System.out.println(isSubsequence(s,t));

    }
}
