class Solution {
     public boolean isSubsequence(String s, String t) {
        int m = t.length();
        int n = s.length();
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == n;
    }
}