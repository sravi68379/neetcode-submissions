class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> group = new HashMap<>();
        for (String str:strs){
            int[] freq = new int[26];
            int n = str.length();
            for (int i=0;i<n;i++){
                int c = str.charAt(i);
                freq[c-97]++;
            }
            group.computeIfAbsent(Arrays.toString(freq),k->new ArrayList<>()).add(str);
        }
        List<List<String>> output = new ArrayList<>(group.values());
        return output;
    }
}
