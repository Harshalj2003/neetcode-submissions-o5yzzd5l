class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> unsortedMap = new HashMap<>();

        for(int n : nums){
            unsortedMap.put(n, unsortedMap.getOrDefault(n, 0) + 1);
        }
        System.out.println(unsortedMap);

        int [] topKFrequent = unsortedMap.entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();

        return topKFrequent;
    }
    
}
