class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> unsortedMap = new HashMap<>();

        for(int n : nums){
            unsortedMap.put(n, unsortedMap.getOrDefault(n, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry: unsortedMap.entrySet()){
            arr.add(new int[]{ entry.getValue(), entry.getKey() });
        }

        arr.sort((a,b) -> b[0] - a[0]);

        int [] topK = new int[k];
        for(int i = 0; i < k; i++){
            topK[i] = arr.get(i)[1];
        }

        return topK;
    }
}
