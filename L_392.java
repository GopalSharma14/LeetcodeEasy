class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())
            return false;
        if(s.length()==0 || t.length()==0)
            return true;
        int left=0;
        int right=0;
        while(right<t.length()){
            if(s.charAt(left)==t.charAt(right)){
                if(left==s.length()-1){
                    return true;
                }
                else{
                    left++;
                    right++;
                }     
            }
            else{
                if(right==t.length()-1) 
                    return false;
                else
                    right++;
            }
        }
        return false;
    }
}