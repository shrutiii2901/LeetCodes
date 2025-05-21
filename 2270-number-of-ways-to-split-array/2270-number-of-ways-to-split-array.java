class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long left =0, right =0;
        int c=0;
        long sum =0;
        for(int num : nums) sum+=num;
        for(int i=0; i<n-1; i++){
            left+=nums[i];
            right= sum-left;
            if(left>=right) c++;
        }
        return c;
    }
}