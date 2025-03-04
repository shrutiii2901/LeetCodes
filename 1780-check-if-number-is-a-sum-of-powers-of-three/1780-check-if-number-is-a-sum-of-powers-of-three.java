class Solution {
     private boolean solve(int n, int p) {
        if (n == 0) {
            return true;
        }
        
        if (Math.pow(3, p) > n) {
            return false;
        }
        
        boolean p_ko_lelo = solve(n - (int)Math.pow(3, p), p + 1);
        boolean p_ko_nahi_lo = solve(n, p + 1);
        
        return p_ko_lelo || p_ko_nahi_lo;
    }
    
    public boolean checkPowersOfThree(int n) {
        return solve(n, 0); 
    }
}