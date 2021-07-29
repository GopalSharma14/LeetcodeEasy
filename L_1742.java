class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int count = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int sum=0;
            int num=i;
            while(num!=0){
                sum+=num%10;
                num=num/10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);       
            count = map.get(sum) > count ? map.get(sum) : count;
        }
        
        return count;
    }
}