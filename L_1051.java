class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<heights.length;i++){
            pq.offer(heights[i]);
        }
        for(int i=0;i<heights.length;i++){
            if(pq.poll()!=heights[i])
                count++;
        }
        return count;
    }
}