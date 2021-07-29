class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length()!=s.length())
            return false;
        int[] newS = new int[26];
        int[] newT = new int[26];
        
        for(char ch: s.toCharArray())
            newS[ch-'a']++;
        for(char c: t.toCharArray())
            newT[c-'a']++;
        if(Arrays.equals(newS,newT))
            return true;
        return false;
    }
}