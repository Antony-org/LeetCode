class Solution {
	public int[] numberGame(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int n : nums) {
			pq.add(n);
		}
		int i = 0;
		while (!pq.isEmpty()) {
			int a = pq.poll();
			int b = pq.poll();

			nums[i] = b;
			i++;
			nums[i] = a;
			i++;
		}
		return nums;
	}
}