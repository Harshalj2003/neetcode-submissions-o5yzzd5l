class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        // int[] store = new int[26];

        // for (int i = 0; i < s.length(); i++) {
        //     store[s.charAt(i) - 'a']++;
        //     store[t.charAt(i) - 'a']--;
        // }

        // for (int n : store) if (n != 0) return false;
        
        // return true;

        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){

            //filling HashMap 1
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            

            //filling HashMap 2
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(int value : map.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}

