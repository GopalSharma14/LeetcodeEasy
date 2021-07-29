class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0)
                leftSum+=nums[i-1];
            if(sum-nums[i]-leftSum==leftSum)
                return i;
        }
        return -1;
    }
}