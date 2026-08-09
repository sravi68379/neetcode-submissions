class Solution {
    public String encode(List<String> strs) {
        StringBuilder output = new StringBuilder();

        for (String str : strs) {
            output.append(str.length()).append("#").append(str);
            // System.out.println(output);
        }
        return output.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int n = str.length();

        int i = 0;

        while (i < n) {
            String number = "";
            boolean gotDigit = false;
            while (i < n && !gotDigit) {
                if (str.charAt(i) == '#') {
                    gotDigit = true;
                } else {
                    number += str.charAt(i);
                }
                i++;
            }
            int num = Integer.parseInt(number);
            String actualString = str.substring(i, i + num);
            output.add(actualString);
            i += num;
        }
        return output;
    }
}
