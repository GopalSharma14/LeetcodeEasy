class Solution {
    public String addStrings(String num1, String num2) {
        int m = num1.length()-1;
        int n = num2.length()-1;
        
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while(m>=0 || n>=0){
            int val1 = m>=0 ? num1.charAt(m)-'0' : 0;
            int val2 = n>=0 ? num2.charAt(n)-'0' : 0;
            int sum = (val1+val2+carry)%10;
            carry = (val1+val2+carry)/10;
            res.append(sum);
            m--;
            n--;            
        }
        if(carry != 0)
            res.append(carry);
        return res.reverse().toString();
    }
}