class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        int first = 0;
        int second = 1;

        for (int num : nums) {
            if (num == val)
                count++;
        }

        while (first < second && second < n) {
            if (nums[first] == val) {
                while (second < n - 1 && nums[second] == val) {
                    second++;
                }
                int temp = nums[second];
                nums[second] = nums[first];
                nums[first] = temp;
            }
            first++;
            second++;
        }
        return n - count;
    }
}