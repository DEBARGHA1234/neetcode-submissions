class Solution {
    public boolean isSubsequence(String s, String t) {
        int si=0,ti=0;
        int check=0;
        while(si<s.length() && ti<t.length()){
            if (s.charAt(si)==t.charAt(ti)){
                si++;
                ti++;
                check++;
            }
            else{
                ti++;
            }
        }
        if(check==s.length()){
            return true;
        }else{
            return false;
        }
    }
}