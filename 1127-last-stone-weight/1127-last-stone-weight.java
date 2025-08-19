class Solution {
public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for(int s : stones){
            pq.add(s);
        }
        while(pq.size() >= 2){
            int y = pq.poll();
            int x = pq.poll();
            if(x == y){
                continue;
            }
            if(y > x){
                pq.add(y-x);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.poll();
    }
}