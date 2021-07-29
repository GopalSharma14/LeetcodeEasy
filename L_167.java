class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int compliment =target- numbers[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment)+1,i+1};
            }
            else map.put(numbers[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}