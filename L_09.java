class Solution {
    public boolean isPalindrome(int x) {
        if (x==0) return true;
        if (x<0 || x%10==0) return false;
        
        int z=0;
        while(x>z){
            int rem = x%10;
            x/= 10;
            z=z*10+rem;       
        } 
        if(x==z || x==z/10)
            return true;
        else
                return false;
        }
}