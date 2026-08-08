class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<n;i++){
            int index=map.getOrDefault(target-nums[i], -1);
            if (index!=-1) return new int[] {index,i};
            if (map.getOrDefault(nums[i], -1)==-1){
                map.put(nums[i],i);
            }
            
        }

        return new int[]{};
        
    }
}
