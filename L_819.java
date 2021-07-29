class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedWords = new HashSet<>();
        for(String s: banned){
            bannedWords.add(s); 
        }
        HashMap<String,Integer> count = new HashMap<>();
        for(String words: paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase().split(" ")){
            if(!bannedWords.contains(words)){
                count.put(words,count.getOrDefault(words,0)+1);
            }
        }
        String res="";
        for(String key: count.keySet()){
            if(res.equals("") || count.get(key)>count.get(res))
                res=key;
        }
        return res;
    }
}