class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<Integer>> group = new HashMap<>();
        List<List<String>> output = new ArrayList<>();
        int n=strs.length;
        for (int i=0;i<n;i++){
            String str = strs[i];
            int[] freq = new int[26];
            for (int c: str.toCharArray()){
                freq[c-97]++;
            }
            group.computeIfAbsent(Arrays.toString(freq),k->new ArrayList<>()).add(i);
        }

        group.forEach((key,value)->{
            List<String> suboutput=new ArrayList<>();
            for (int index:value){
                suboutput.add(strs[index]);
            }
            output.add(suboutput);
        });
        return output;
    }
}
