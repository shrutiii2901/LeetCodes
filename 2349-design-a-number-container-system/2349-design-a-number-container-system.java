class NumberContainers {

    private Map<Integer, Integer> idxToNum;
    private Map<Integer, PriorityQueue<Integer>> numToIdx;

    public NumberContainers() {
        idxToNum = new HashMap<>();
        numToIdx = new HashMap<>();
    }
    
    public void change(int index, int number) {
         idxToNum.put(index, number); // O(1)
        numToIdx.putIfAbsent(number, new PriorityQueue<>());
        numToIdx.get(number).offer(index); // O(log(n)
    }
    
    public int find(int number) {
         if (!numToIdx.containsKey(number)) {
            return -1;
        }

        PriorityQueue<Integer> pq = numToIdx.get(number);

        while (!pq.isEmpty()) { // O(k * logn)
            int idx = pq.peek(); // O(1)
            if (idxToNum.get(idx) == number) {
                return idx;
            }
            pq.poll(); // O(log(n))
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */