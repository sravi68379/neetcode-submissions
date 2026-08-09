class Solution {
    public String encode(List<String> strs) {
        String output = "";

        for (String str : strs) {
            int length = str.length();
            output += length;
            output += "#";
            output += str;
            // System.out.println(output);
        }
        return output;
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
            String actualString ="";
            for (int j=i;j<i+num;j++){
                actualString+=str.charAt(j);
            }
            output.add(actualString);
            i+=num;
        }
        return output;
    }
}
