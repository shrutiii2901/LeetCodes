/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
         // Step 1 - Find the peak index
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        int peak = start;

        // Step 2 - Binary search on the increasing part
        int result = binarySearch(mountainArr, target, 0, peak, true);
        if (result != -1) {
            return result;
        }

        // Step 3 - Binary search on the decreasing part
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    private int binarySearch(MountainArray arr, int target, int start, int end, boolean isAscending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if (midVal == target) {
                return mid;
            }

            if (isAscending) {
                if (midVal < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (midVal > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
