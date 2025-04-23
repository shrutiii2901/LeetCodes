class Solution {
     public int findDigitsSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Main method to count largest group
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSize = 0;
        int count = 0;

        for (int num = 1; num <= n; num++) {
            int digitsSum = findDigitsSum(num);
            map.put(digitsSum, map.getOrDefault(digitsSum, 0) + 1);

            int groupSize = map.get(digitsSum);
            if (groupSize == maxSize) {
                count++;
            } else if (groupSize > maxSize) {
                maxSize = groupSize;
                count = 1;
            }
        }

        return count;
    }
}