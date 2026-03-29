class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        // HashMap<Character, Integer> hm1 = new HashMap<>();
        // HashMap<Character, Integer> hm2 = new HashMap<>();
        
        // for(int i = 0; i < s.length(); i++){

        //     //filling HashMap 1
        //     hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i), 0) + 1);
            

        //     //filling HashMap 2
        //     hm2.put(t.charAt(i), hm2.getOrDefault(t.charAt(i), 0) + 1);
        // }

        // if(hm1.equals(hm2)){
        //     return true;
        // }
        // return false;


        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false; 
        return true;
    }
}

