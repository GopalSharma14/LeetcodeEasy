class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] ch = new int[26];
        for(int i=0;i<arr.length;i++)
            ch[arr[i]-'a']++;
        System.out.println(Arrays.toString(ch));
        for(int j=0;j<arr.length;j++){
            if(ch[arr[j]-'a']==1)
                return j;
        }
        return -1;
    }
}