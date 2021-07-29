class Solution {
    public String reverseOnlyLetters(String S) {
      int left = 0;
int right = S.length()-1;

    char[] ch = S.toCharArray();
    while(left < right){
        if(!Character.isLetter(ch[left])){
            left++;
        }else if(!Character.isLetter(ch[right])){
            right--;
        }else{
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }
    
    return String.valueOf(ch);
}
}