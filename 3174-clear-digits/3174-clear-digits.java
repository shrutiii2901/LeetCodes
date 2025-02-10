class Solution {
    public String clearDigits(String s) {
        char[] arr = s.toCharArray();
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                j = Math.max(j - 1, 0);
            } else {
                arr[j] = arr[i];
                j++;
            }
        }

        return new String(arr, 0, j);
    }
}