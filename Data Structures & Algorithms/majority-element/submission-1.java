class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;

        if (n==1 || n==2) return nums[0];

        int candidate=nums[0];
        int count=0;

        for (int num:nums){
            if(count==0){
                candidate=num;
            }
            count+=(candidate==num)?1:-1;
        }

        return candidate;
    }
}