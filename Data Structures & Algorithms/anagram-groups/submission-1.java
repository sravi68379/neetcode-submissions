class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> group = new HashMap<>();
        for (String str:strs){
            int[] freq = new int[26];
            for (int c: str.toCharArray()){
                freq[c-97]++;
            }
            group.computeIfAbsent(Arrays.toString(freq),k->new ArrayList<>()).add(str);
        }
        List<List<String>> output = new ArrayList<>(group.values());
        return output;
    }
}
