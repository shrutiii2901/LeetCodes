class Solution {
    public String convert(String s, int numRows) {
         if (numRows == 1) return s;
        
        StringBuilder res = new StringBuilder();
        int jumps = (numRows - 1) * 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += jumps) {
                res.append(s.charAt(j));
                if (i > 0 && i < numRows - 1 && (j + jumps - 2 * i) < s.length()) {
                    res.append(s.charAt(j + jumps - 2 * i));
                }
            }
    }
    return res.toString();
}
 
}