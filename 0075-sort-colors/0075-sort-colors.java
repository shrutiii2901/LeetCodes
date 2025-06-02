class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int lo=0;
        int hi = n-1;
        int mid =0, temp=0;

        while(mid<=hi){
            if(nums[mid]==0){
                swap(nums, mid,lo);
                lo++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums, mid,hi);
                hi--;
            }
        }
    }
    static void swap(int[]nums, int i, int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}