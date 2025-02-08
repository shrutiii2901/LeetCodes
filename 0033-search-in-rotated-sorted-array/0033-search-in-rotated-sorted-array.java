class Solution {
    public int search(int[] nums, int target) {
         int n = nums.length;
        int left = 0, right = n - 1, mid;

        // Iterative binary search
        while (left <= right) {
            mid = left + (right - left) / 2; // Avoid overflow

            if (nums[mid] == target)
                return mid;

            // Left half is sorted
            if (nums[mid] >= nums[left]) {
                if (target >= nums[left] && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (target >= nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}