class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int num : map.keySet()){
            pq.offer(num);
            if (pq.size() > k){
                pq.poll();
            }
        }

        int[] keys = new int[k];
        for(int i = 0; i < k; i++){
            keys[i] = pq.poll();
        }
        return keys;
    }
}