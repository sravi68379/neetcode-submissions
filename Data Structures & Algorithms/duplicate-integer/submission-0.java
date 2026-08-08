class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int num: nums){
            if (freq.getOrDefault(num, 0)==1) return true;
            freq.put(num,freq.getOrDefault(num, 0)+1);
        }
        return false;
    }
}