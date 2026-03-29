class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int arrLen = strs.length;
        List <List<String>> foundAnagrams = new ArrayList<>();
        HashMap<String, ArrayList<String>> myMap = new HashMap<>();

        if (strs == null || strs.length < 2) {
            List<List<String>> result = new ArrayList<>();
            if (strs != null && strs.length == 1) {
                result.add(List.of(strs[0])); // Add the single element
            }
            return result;
        }

        for(int i = 0; i < arrLen; i++){
            
            char [] currStr = strs[i].toCharArray();
            Arrays.sort(currStr);
            String key = new String(currStr);

            ArrayList<String> isKeyThere = myMap.get(key);
            ArrayList<String> realValue = new ArrayList<>();
            realValue.add(strs[i]);

            if(isKeyThere == null){
                isKeyThere = new ArrayList<>();
                myMap.put(key, realValue);
            }
            isKeyThere.add(strs[i]);
        }

        for(List<String> list : myMap.values()){
            foundAnagrams.add(list);
        }
        
        System.out.println(foundAnagrams);
        return foundAnagrams;
    }
}
