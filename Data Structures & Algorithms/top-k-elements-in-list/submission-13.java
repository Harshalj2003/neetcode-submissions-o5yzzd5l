class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> unsortedMap = new HashMap<>();

        for(int n : nums){
            unsortedMap.put(n, unsortedMap.getOrDefault(n, 0) + 1);
        }

        int [] topKFrequent = unsortedMap.entrySet()
        .stream()
        .sorted((Map.Entry.<Integer, Integer>comparingByValue().reversed()))
        //.sorted((e1, e2) -> e2.getValue() - e1.getValue())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        // .mapToInt(entry -> entry.getValue())
        .toArray();

        return topKFrequent;
    }
    
}
