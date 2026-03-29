class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int arrLen = strs.length;
        List <List<String>> foundAnagrams = new ArrayList<>();
        HashMap<String, List<String>> myMap = new HashMap<>();

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

            List<String> isKeyThere = myMap.get(key);
            List<String> realValue = new ArrayList<>();
            realValue.add(strs[i]);

            if(isKeyThere == null){
                isKeyThere = new ArrayList<>();
                myMap.put(key, realValue);
            }
            isKeyThere.add(strs[i]);

        }
        // System.out.println(myMap);

        for(List<String> list : myMap.values()){
            foundAnagrams.add(list);
        }
        
        System.out.println(foundAnagrams);
        return foundAnagrams;




        // for(int i = 0; i < arrLen; i++){
        //     String currStr = strs[i];
        //     int store[] = new int[26];
        //     int j = 0;
        //     while(j < currStr.length()){
        //         store[currStr.charAt(i) - 'a']++;
        //         store[currStr.charAt(i) - 'a']--;
        //         j++;
        //     }
        //     j = 0;

        //     for(int n : store){
        //         if(n != 0){
                    
        //         }
        //     }
        // }
    }
}
