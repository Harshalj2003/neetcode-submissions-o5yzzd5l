class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        if (strs == null && strs.length == 0) return new ArrayList<>();

        for(String i : strs){
            char[] currStr = i.toCharArray();
            Arrays.sort(currStr);
            String key = new String(currStr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(i);
        }

        System.out.println(map.values());
        return new ArrayList<>(map.values());
    }
}

