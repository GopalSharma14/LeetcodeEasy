class Solution {
    public int titleToNumber(String columnTitle) {
        int factor=1;
        int result=0;
        char[] arr= columnTitle.toCharArray();
        for(int i=columnTitle.length()-1;i>=0;i--){
            result+= (arr[i]-'A'+1)*factor;
            factor*=26;
        }
        return result;
    }
}