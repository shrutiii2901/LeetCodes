class Solution {
     private boolean isPrime(int num) {
        if (num == 1) { // not a prime
            return false;
        }
        for (int div = 2; div * div <= num; div++) {
            if (num % div == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] closestPrimes(int left, int right) {
        List<Integer> primes = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            if (isPrime(num)) {
                if (!primes.isEmpty() && num - primes.get(primes.size() - 1) <= 2) {
                    return new int[]{primes.get(primes.size() - 1), num}; // Early return
                }
                primes.add(num);
            }
        }

        int minDiff = Integer.MAX_VALUE;
        int[] result = {-1, -1};
        for (int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = primes.get(i - 1);
                result[1] = primes.get(i);
            }
        }

        return result;
    }
}