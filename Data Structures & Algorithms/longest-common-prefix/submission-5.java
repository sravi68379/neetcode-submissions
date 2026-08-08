class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        boolean traverse = true;
        String lcp = "";
        int index = 0;
        while (traverse) {
            if (strs[0].length() <= index) {
                if (index == 0)
                    return "";
                else
                    return strs[0].substring(0, index);
            }
            if (traverse) {
                char value = strs[0].charAt(index);

                for (int j = 1; j < n; j++) {
                    if (strs[j].length() <= index
                        || (strs[j].length() > index) && strs[j].charAt(index) != value) {
                        if (index == 0)
                            return "";
                        else
                            return strs[0].substring(0, index);
                    }
                }
                index++;
            }
        }
        if (index == 0)
            return "";
        return strs[0].substring(0, index);
    }
}