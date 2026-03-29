class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String s : strs){
            char [] temp = s.toCharArray();
            Arrays.sort(temp);
            String sorted_word = new String(temp);
            ArrayList<String> currList = map.getOrDefault(sorted_word, new ArrayList<String>());
            currList.add(s);
            map.put(sorted_word, currList);
        }
        List<List<String>> result = new ArrayList<>();
        Iterator i = map.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry<String, ArrayList<String>> me = (Map.Entry) i.next();
            result.add(me.getValue());
        }
        return result;
    }
}
