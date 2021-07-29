class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(set.contains(ch[i])){
                set.remove(ch[i]);
            }
            else{
                set.add(ch[i]);
            }
        }
            if(set.size()<=1)
                return s.length();
            else
                return s.length()-set.size()+1;
    }
}