class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num:nums){
            map.put(num,map.getOrDefault(num, 0)-1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(map::get));

        heap.addAll(map.keySet());

        int[] output = new int[k];

        for (int i=0;i<k;i++){
            output[i]=heap.poll();
        }
        return output;
    }
}
