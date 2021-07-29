class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones)
            pq.offer(i);
        while(pq.size()>1){
            int num1= pq.poll();
            int num2 =pq.poll();
            if(num1!=num2)
                pq.offer(num1-num2);
        }
        return pq.isEmpty()?0:pq.peek();
    }
}