class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length;
        int n = s.length;
        int count =0;
        int left=0;
        int right=0;

        while(left<n &&right<m){
            if(g[right]<=s[left]){
                count++;
                right++;
            }
            left++;
        }
        return count;
    }
}