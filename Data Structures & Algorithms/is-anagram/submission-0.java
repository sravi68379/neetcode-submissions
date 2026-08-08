class Solution {
    public boolean isAnagram(String s, String t) {
        char [] freq1 = new char[26];
        char [] freq2 = new char[26];

        for (int c: s.toCharArray()){
            freq1[c-97]++;
        }
        for (int c: t.toCharArray()){
            freq2[c-97]++;
        }

        for (int i=0;i<26;i++){
            if (freq1[i]!=freq2[i]) return false;
        }
        return true;
    }
}
