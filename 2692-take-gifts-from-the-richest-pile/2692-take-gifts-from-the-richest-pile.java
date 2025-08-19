class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b-a));
        long sum = 0;
        for (int gift : gifts) {
            pq.add(gift);
        }
        for(int i = 0; i < k; i ++){
            int a = (int) Math.sqrt(pq.poll());
            pq.add(a);
        }

        while(pq.size() > 0){
            sum += pq.remove();
        }
        return sum;
    }
}