class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int min = Integer.MAX_VALUE;

        for (int i=0;i<n;i++){
            if (min>strs[i].length()){
                min=strs[i].length();
            }
        }
        boolean traverse=true;
        String lcp = "";
        for (int i=0;i<min;i++){
            char value=strs[0].toCharArray()[i];
            for (int j=1;j<n;j++){
                if (strs[j].toCharArray()[i]!=value) {
                    traverse=false;
                    break;
                }
            }

            if (!traverse) break;
            lcp+=value;
        }

        return lcp;
    }
}