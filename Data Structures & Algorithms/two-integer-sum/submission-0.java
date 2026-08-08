class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        for (int i=0;i<n;i++){
            int j=i+1;

            while (j<n){
                if (target-nums[i]==nums[j]) return new int[]{i,j};
                j++;
            }
        }
        return new int[] {};
        
    }
}
