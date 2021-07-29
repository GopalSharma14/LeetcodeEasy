class Solution {
    public String reverseVowels(String s) {
         HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int left=0;
        int right= s.length()-1;
        char[] word = s.toCharArray();
        while(left<right){
            if(!set.contains(word[left]))
                left++;
            else if(!set.contains(word[right]))
                right--;
            else{
                char c= word[left];
                word[left]=word[right];
                word[right]= c;
                left++;
                right--;
            }
        }
        return String.valueOf(word);
    }
}