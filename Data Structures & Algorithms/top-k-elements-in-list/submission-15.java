class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> unsortedMap = new HashMap<>();

        for(int n : nums){
            unsortedMap.put(n, unsortedMap.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (t1,t2) -> Integer.compare(t1.getValue(), t2.getValue())
        );

        for(Map.Entry<Integer, Integer> entry: unsortedMap.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int [] topK = new int[k];
        for(int i = 0; i < k; i++){
            topK[i] = minHeap.poll().getKey();
        }

        return topK;
    }
}
