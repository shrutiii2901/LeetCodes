class Solution {
    private int getDigitSum(int num) {
        int sum = 0;
        
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        
        return sum;
    }
    
    public int maximumSum(int[] nums) {
        int n = nums.length;
        int result = -1;
        
        int[] mp = new int[82]; // Since max digit sum is 81
        
        for (int i = 0; i < n; i++) {
            int digitSum = getDigitSum(nums[i]);
            
            if (mp[digitSum] > 0) {
                result = Math.max(result, nums[i] + mp[digitSum]);
            }
            
            mp[digitSum] = Math.max(mp[digitSum], nums[i]);
        }
        
        return result;
    }
}