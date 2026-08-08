class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        int [] newArr = new int[2*n];
        for (int i = 0; i<2*n;i++){
            int index = i%n;
            newArr[i]=nums[index];
        }

        return newArr;
    }
}