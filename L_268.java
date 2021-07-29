class Solution {
    public int missingNumber(int[] nums) {
        int len= nums.length;
        int sum=0;
        for(int n: nums)
            sum+=n;
        int x =(len*(len+1)/2)-sum;
        return x;
        
    }
}