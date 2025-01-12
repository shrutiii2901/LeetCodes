class Solution {
    public boolean canBeValid(String s, String locked) {
         int n = s.length();

        if (n % 2 != 0) { // odd
            return false;
        }

        // L to R
        int open = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || locked.charAt(i) == '0') {
                open++;
            } else {
                open--;
            }

            if (open < 0) {
                return false;
            }
        }

        // R to L
        int close = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || locked.charAt(i) == '0') {
                close++;
            } else {
                close--;
            }

            if (close < 0) {
                return false;
            }
        }

        return true;
    }
}