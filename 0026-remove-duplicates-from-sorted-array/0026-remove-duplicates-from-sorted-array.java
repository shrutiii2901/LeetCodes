class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        HashSet<Integer> s = new HashSet<>();

        int idx=0;

        for(int i =0; i < n; i ++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}