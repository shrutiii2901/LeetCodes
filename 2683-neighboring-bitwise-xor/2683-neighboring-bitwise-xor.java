class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;

        //Try starting with original[0] = 0;
        int[] original = new int[n];
        original[0] = 0;
        for(int i = 0; i < n-1; i++) {
            original[i+1] = original[i] ^ derived[i];
        }

        if((original[n-1] ^ original[0]) == derived[n-1]) {
            return true;
        }

        //Let's try with original[0] = 1
        original[0] = 1;
        for(int i = 0; i < n-1; i++) {
            original[i+1] = original[i] ^ derived[i];
        }

        if((original[n-1] ^ original[0]) == derived[n-1]) {
            return true;
        }

        return false;
    
    }
}