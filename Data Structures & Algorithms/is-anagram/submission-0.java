class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> string=new HashMap<>();
        int s_len=s.length();
        int t_len=t.length();
        if(s_len!=t_len){
            return false;
        }
        else{
            for(int i=0;i<s_len;i++){
            string.put(s.charAt(i),string.getOrDefault(s.charAt(i),0)+1);
            }
            for(int i=0;i<t_len;i++){
                string.put(t.charAt(i),string.getOrDefault(t.charAt(i),0)-1);
                if(string.get(t.charAt(i))<0){
                    return false;
                }
            }
            return true;
        }    

    }
}
