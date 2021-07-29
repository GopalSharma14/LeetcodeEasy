class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       String[] codes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        int count=1;        
        if(words.length==1)
            return 1;  
        if(words.length==0)
            return 0;
        for(int i=0;i<words.length;i++){
            List<String> list = new LinkedList<>();
            StringBuilder code= new StringBuilder();
            for(char c : words[i].toCharArray()){
                code.append(codes[c-'a']);             
            }
            set.add(code.toString());
        }
        return set.size();
}
}