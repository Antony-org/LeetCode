class Solution {
    public int thirdMax(int[] nums) {
        int num = 0;
        int max = nums[0];
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                num++;
                max = nums[i];
                if (num == 3) {
                    return max;
                }
            }

        }

            num++;
            if(num == 3)
                return nums[0];

        return nums[nums.length - 1];
    }
}