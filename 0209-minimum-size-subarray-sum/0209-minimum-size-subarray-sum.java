class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLenWindow = Integer.MAX_VALUE;
        int currentSum =0;
        int low=0;
        int high =0;

        while(high<nums.length){
            currentSum+= nums[high];
            high++;

            while(currentSum>=target){
                int currentWindow=high-low;

                minLenWindow = Math.min(minLenWindow,currentWindow);

                currentSum-= nums[low];
                low++;
            }
        }
        return minLenWindow==Integer.MAX_VALUE?0:minLenWindow;
    }
}