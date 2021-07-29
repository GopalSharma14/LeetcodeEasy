class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<order.length();i++)
            map.put(order.charAt(i),i);
        String prev ="";
        for(String word: words){
            if(!check(prev,word,map)){
                return false;
            }
            prev= word;
        }
        return true;
    }
    public boolean check(String prev, String word, HashMap<Character,Integer> map ){
        
        int len = Math.min(prev.length(),word.length());
        for(int i=0;i<len;i++){
            int c1 = map.get(prev.charAt(i));
            int c2 = map.get(word.charAt(i));
        if(c1==c2)
            continue;
        else if(c1>c2)
            return false;
        else return true;
        }
        return prev.length()<=word.length();
    }
}